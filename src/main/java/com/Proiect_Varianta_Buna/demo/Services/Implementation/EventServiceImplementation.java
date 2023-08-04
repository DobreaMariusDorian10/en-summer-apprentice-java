package com.Proiect_Varianta_Buna.demo.Services.Implementation;

import com.Proiect_Varianta_Buna.demo.Repositories.EventRepository;
import com.Proiect_Varianta_Buna.demo.Services.EventService;
import com.Proiect_Varianta_Buna.demo.Services.DTO.EventDto;
import com.Proiect_Varianta_Buna.demo.Services.Mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImplementation implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImplementation(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public EventDto findByEventName(String eventName) {
        return EventMapper.convertDTO(eventRepository.findByEventName(eventName));
    }

    @Override
    public EventDto findByVenueVenueIDAndEventTypeEventTypeName(int venueID, String eventType) {
        return EventMapper.convertDTO(eventRepository.findByVenueID_VenueIDAndEventTypeID_EventTypeName(venueID, eventType));
    }

    @Override
    public List<EventDto> findAll() {
        return eventRepository.findAll().stream().map(EventMapper::convertDTO).collect(Collectors.toList());
    }
}
