package com.Proiect_Varianta_Buna.demo.Services.Mapper;
import com.Proiect_Varianta_Buna.demo.Services.DTO.TicketCategoryDTO;
import com.Proiect_Varianta_Buna.demo.TableEntities.Event;
import com.Proiect_Varianta_Buna.demo.Services.DTO.EventDto;
import com.Proiect_Varianta_Buna.demo.TableEntities.TicketCategory;
import com.Proiect_Varianta_Buna.demo.Services.Mapper.TicketCategoryMapper;

import java.util.ArrayList;
import java.util.List;

public class EventMapper {
    public static EventDto convertDTO(Event event){
        EventDto eventDto = new EventDto();
        eventDto.setEventID(event.getEventID());
        eventDto.setVenue(event.getVenueID());
        eventDto.setType(event.getEventTypeID().getEventTypeName());
        eventDto.setEventDescription(event.getEventDescription());
        eventDto.setEventName(event.getEventName());
        eventDto.setEventStartDate(event.getStartDate());
        eventDto.setGetEventEndDate(event.getEndDate());
//       // eventDto.setTicketCategoryList(event.getTicketCategories());
//
//        return  eventDto;
        List<TicketCategoryDTO> ticketCategoryDTOs = new ArrayList<>();
        for (TicketCategory ticketCategory : event.getTicketCategories()) {
            TicketCategoryDTO ticketCategoryDTO = TicketCategoryMapper.convertDTO(ticketCategory);
            ticketCategoryDTOs.add(ticketCategoryDTO);
        }
        eventDto.setTicketCategories(ticketCategoryDTOs);
        return eventDto;
    }

    public List<EventDto> convertDTOs(List<Event> events) {
        List<EventDto> eventDTOs = new ArrayList<>();

        for (Event event : events) {
            eventDTOs.add(convertDTO(event));
        }

        return eventDTOs;
    }
}
