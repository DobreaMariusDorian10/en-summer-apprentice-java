package com.Proiect_Varianta_Buna.demo.TableEntities.DTO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonDeserialize
public class OrderRequestDTO {
    private Long eventID;
    private Long ticketCategoryID;
    private int numberOfTickets;
}