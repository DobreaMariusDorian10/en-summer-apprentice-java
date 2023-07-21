package com.Proiect_Varianta_Buna.demo.Services;

import com.Proiect_Varianta_Buna.demo.Interfaces.IEventService;
import com.Proiect_Varianta_Buna.demo.Repositories.EventRepository;
import com.Proiect_Varianta_Buna.demo.TableEntities.Event;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements IEventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }



    @Override
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }
}