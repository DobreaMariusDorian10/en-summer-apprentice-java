package com.Proiect_Varianta_Buna.demo.Services;
import com.Proiect_Varianta_Buna.demo.Repositories.EventRepository;
import com.Proiect_Varianta_Buna.demo.Repositories.EventTypeRepository;
import com.Proiect_Varianta_Buna.demo.Repositories.TicketCategoryRepository;
import com.Proiect_Varianta_Buna.demo.Repositories.VenueRepository;
import com.Proiect_Varianta_Buna.demo.TableEntities.DTO.EventAddDTO;
import com.Proiect_Varianta_Buna.demo.TableEntities.DTO.EventDTO;
import com.Proiect_Varianta_Buna.demo.TableEntities.DTO.TicketCategoryDTO;
import com.Proiect_Varianta_Buna.demo.TableEntities.Event;
import com.Proiect_Varianta_Buna.demo.TableEntities.EventType;
import com.Proiect_Varianta_Buna.demo.TableEntities.TicketCategory;
import com.Proiect_Varianta_Buna.demo.TableEntities.Venue;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EventService {

    final EventRepository eventRepository;
    final TicketCategoryRepository ticketCategoryRepository;
    final VenueRepository venueRepository;
    final EventTypeRepository eventTypeRepository;

    public Event getEventByID(Integer EventID){
        return eventRepository.findById(EventID).get();
    }

    public List<EventDTO> getAllEvents(){
        List<EventDTO> eventDTO = new ArrayList<>();
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(ev ->events.add(ev));

        for(Event ev : events) {
            List<TicketCategory> ticketCategory = ticketCategoryRepository.findTicketCategoriesByEvent_EventID(ev.getEventID());
            List<TicketCategoryDTO> ticketCategoryDTO = new ArrayList<>();
            for (TicketCategory tk : ticketCategory) {
                ticketCategoryDTO.add(new TicketCategoryDTO(tk.getTicketCategoryID(), tk.getDescription(), tk.getPrice()));
            }
            eventDTO.add(new EventDTO(ev.getEventID(), ev.getVenueID(), ev.getEventTypeID().getEventTypeName(), ev.getEventDescription(), ev.getEventName(), ev.getStartDate(), ev.getEndDate(), ticketCategoryDTO));
        }
        return eventDTO;
    }

    public EventDTO getEventByVenueIDandEventType(Integer venueID, String eventType){

        Event event = eventRepository.findByVenueID_VenueIDAndEventTypeID_EventTypeName(venueID, eventType);
        List<TicketCategory> ticketCategory = ticketCategoryRepository.findTicketCategoriesByEvent_EventID(venueID);
        List<TicketCategoryDTO> ticketCategoryDTO = new ArrayList<>();
        for (TicketCategory tk: ticketCategory) {
            ticketCategoryDTO.add(new TicketCategoryDTO(tk.getTicketCategoryID(),tk.getDescription(),tk.getPrice()));
        }
        return new EventDTO(event.getEventID(), event.getVenueID(),event.getEventTypeID().getEventTypeName(), event.getEventDescription(),event.getEventName(),event.getStartDate(),event.getEndDate(),ticketCategoryDTO);
    }
    public EventDTO postEvents(EventAddDTO eventAddDTO){
        Venue venue = venueRepository.findVenueByLocationName(eventAddDTO.venueLocation);

        EventType eventType = eventTypeRepository.findEventTypeByEventTypeID(eventAddDTO.eventTypeID);


        Event createdEvent = new Event(venue, eventType, eventAddDTO.eventDescription, eventAddDTO.eventName, eventAddDTO.startDate, eventAddDTO.endDate);

        List<TicketCategory> ticketCategory = ticketCategoryRepository.findTicketCategoriesByEvent_EventID(createdEvent.getEventID());
        List<TicketCategoryDTO> ticketCategoryDTO = new ArrayList<>();
        for (TicketCategory tk: ticketCategory) {
            ticketCategoryDTO.add(new TicketCategoryDTO(tk.getTicketCategoryID(),tk.getDescription(),tk.getPrice()));
        }
        eventRepository.save(createdEvent);
        return new EventDTO(createdEvent.getEventID(), createdEvent.getVenueID(), createdEvent.getEventTypeID().getEventTypeName(), createdEvent.getEventDescription(), createdEvent.getEventName(),createdEvent.getStartDate(),createdEvent.getEndDate(), ticketCategoryDTO);
    }

}