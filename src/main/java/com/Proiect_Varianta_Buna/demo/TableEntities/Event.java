package com.Proiect_Varianta_Buna.demo.TableEntities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column ( name = "EventID" )
    private int eventID;

    @JoinColumn(name = "venueID", nullable = false)
    @ManyToOne
    private Venue venueID;

    @JoinColumn(name = "eventTypeID", nullable = false)
    @ManyToOne
    private EventType eventTypeID;

    @Column ( name = "EventDescription" )
    private String eventDescription;

    @Column ( name = "EventName" )
    private String eventName;

    @Column ( name = "StartDate" )
    private Date startDate;

    @Column ( name = "EndDate" )
    private Date endDate;

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public Venue getVenueID() {
        return venueID;
    }

    public void setVenueID(Venue venueID) {
        this.venueID = venueID;
    }

    public EventType getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(EventType eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Event() {
    }

    public Event(int eventID, Venue venueID, EventType eventTypeID, String eventDescription, String eventName, Date startDate, Date endDate) {
        this.eventID = eventID;
        this.venueID = venueID;
        this.eventTypeID = eventTypeID;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER)
    private List<TicketCategory> ticketCategories;

    public List<TicketCategory> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategory> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }
}