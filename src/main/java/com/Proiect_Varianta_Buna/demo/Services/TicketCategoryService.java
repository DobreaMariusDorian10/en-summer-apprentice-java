package com.Proiect_Varianta_Buna.demo.Services;
import com.Proiect_Varianta_Buna.demo.Repositories.EventRepository;
import com.Proiect_Varianta_Buna.demo.Repositories.TicketCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TicketCategoryService {

    final TicketCategoryRepository ticketCategoryRepository;
    final EventRepository eventRepository;

//    public TicketCategory addTicketCategory(TicketCategoryAddDTO ticketCategoryAddDTO){
//        Event event = eventRepository.findByEventName(ticketCategoryAddDTO.getEventName());
//
//        return ticketCategoryRepository.save(new TicketCategory(event,ticketCategoryAddDTO.getPrice(),ticketCategoryAddDTO.getDescription()));
//    }

//    public void deleteTicketCategory(String eventName, String description){
//        TicketCategory ticketCategory = ticketCategoryRepository.findTicketCategoryByEvent_EventNameAndDescription(eventName,description);
//
//        ticketCategoryRepository.delete(ticketCategory);
//    }
}