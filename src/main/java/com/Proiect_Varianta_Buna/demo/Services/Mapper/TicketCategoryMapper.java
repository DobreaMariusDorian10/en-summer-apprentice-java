package com.Proiect_Varianta_Buna.demo.Services.Mapper;

import com.Proiect_Varianta_Buna.demo.Services.DTO.TicketCategoryDTO;
import com.Proiect_Varianta_Buna.demo.TableEntities.TicketCategory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TicketCategoryMapper {
    public static TicketCategoryDTO convertDTO(TicketCategory ticketCategory) {
        TicketCategoryDTO ticketCategoryDTO = new TicketCategoryDTO();
        ticketCategoryDTO.setDescription(ticketCategory.getDescription());
        ticketCategoryDTO.setPrice(ticketCategory.getPrice());

        return ticketCategoryDTO;
    }

    public List<TicketCategoryDTO> convertDTOs(List<TicketCategory> ticketCategories) {
        List<TicketCategoryDTO> ticketCategoryDTOs = new ArrayList<>();

        for (TicketCategory ticketCategory : ticketCategories) {
            ticketCategoryDTOs.add(convertDTO(ticketCategory));
        }

        return ticketCategoryDTOs;
    }
}