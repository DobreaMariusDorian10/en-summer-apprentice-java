package com.Proiect_Varianta_Buna.demo.Controller;

import com.Proiect_Varianta_Buna.demo.Services.EventService;
import com.Proiect_Varianta_Buna.demo.Services.DTO.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private EventService eventService;
    @Autowired
    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @RequestMapping(value = "/findByEventName/{eventName}", method = RequestMethod.GET)
    public EventDto findByEventName(@PathVariable String eventName){
        System.out.println("Request event/findByEventName/" + eventName);
        return eventService.findByEventName(eventName);
    }
    @RequestMapping(value = "/findByVenueIDAndEventType/{venueID}/{eventType}",method = RequestMethod.GET)
    public EventDto findByVenueVenueIDAndEventTypeEventTypeName(@PathVariable int venueID,@PathVariable String eventType){
        System.out.println("Request event/findByVenueIDAndEventType/"+venueID+eventType);
        return eventService.findByVenueVenueIDAndEventTypeEventTypeName(venueID,eventType);
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<EventDto> findAll(){
        System.out.println("Request event/all");
        return eventService.findAll();
    }
}