package com.Proiect_Varianta_Buna.demo.Services.DTO;
import com.Proiect_Varianta_Buna.demo.TableEntities.TicketCategory;
import com.Proiect_Varianta_Buna.demo.TableEntities.Venue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonSerialize
public class EventDto {
    private int eventID;
    private Venue venue;
    private String type;
    private String eventDescription;
    private String eventName;
    private Date eventStartDate;
    private Date getEventEndDate;
    private List<TicketCategoryDTO> ticketCategories;

}