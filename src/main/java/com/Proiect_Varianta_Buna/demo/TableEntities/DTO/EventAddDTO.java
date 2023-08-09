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
public class EventAddDTO {
    public String venueLocation;
    public Integer eventTypeID;
    public String eventName;
    public String eventDescription;
    public Date startDate;
    public Date endDate;


}