package com.Proiect_Varianta_Buna.demo.TableEntities.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderFeDTO {
    Integer eventID;
    Date orderedAt;
    TicketCategoryDTO ticketCategoryDTO;
    float numberOfTickets;
    float totalPrice;
}