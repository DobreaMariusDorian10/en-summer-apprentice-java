package com.Proiect_Varianta_Buna.demo.TableEntities.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderPatchDTO {
    Integer orderID;
    String ticketCategoryDescription;
    long nrTickets;
}