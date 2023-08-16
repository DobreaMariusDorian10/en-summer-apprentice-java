package com.Proiect_Varianta_Buna.demo.Controller;

import com.Proiect_Varianta_Buna.demo.Services.EventService;
import com.Proiect_Varianta_Buna.demo.TableEntities.DTO.EventAddDTO;
import com.Proiect_Varianta_Buna.demo.TableEntities.DTO.EventDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class EventController {

    final EventService eventService;

    @GetMapping("/eventById")
    public EventDTO getEventByVenueIDandEventType(@RequestParam Integer venueID, @RequestParam String eventType){
        return eventService.getEventByVenueIDandEventType(venueID, eventType);
    }
    @GetMapping("/getAllEvents")
    public List<EventDTO> getAllEvents(){
        List<EventDTO> ev = eventService.getAllEvents();
        return ev;
    }

    @GetMapping("/getEventsByEventType")
    public List<EventDTO> getEventsByEventType(@RequestParam String eventType) {
        return eventService.getEventsByEventType(eventType);
    }
    @GetMapping("/getEventsByVenueLocation")
    public List<EventDTO> getEventsByVenueLocation(@RequestParam String locationName) {
        return eventService.getEventsByVenueLocation(locationName);
    }
}