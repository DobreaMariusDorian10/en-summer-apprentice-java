package com.Proiect_Varianta_Buna.demo.Services;
import com.Proiect_Varianta_Buna.demo.Services.DTO.EventDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EventService {
    EventDto findByEventName(String name);
    EventDto findByVenueVenueIDAndEventTypeEventTypeName(int venueID,String eventType);
    List<EventDto> findAll();
}