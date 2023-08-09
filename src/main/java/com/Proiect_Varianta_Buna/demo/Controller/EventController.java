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

    @PostMapping("/postEvent")
    public EventDTO postEvent(@RequestBody EventAddDTO eventAddDTO){
        return eventService.postEvents(eventAddDTO);
    }
//    @DeleteMapping("/deleteEvent")
//    @ResponseStatus(code = HttpStatus.NO_CONTENT)
//    public void deleteEvent(@RequestParam String eventName) {
//        eventService.deleteEvent(eventName);
//    }
}