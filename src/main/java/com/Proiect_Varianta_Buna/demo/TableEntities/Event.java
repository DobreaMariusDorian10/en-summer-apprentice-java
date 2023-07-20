package com.Proiect_Varianta_Buna.demo.TableEntities;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column ( name = "EventID" )
    private int EventID;

    @JoinColumn(name = "venueId", nullable = false)
    @ManyToOne(fetch=FetchType.LAZY)
    private Venue venueId;

    @JoinColumn(name = "eventTypeID", nullable = false)
    @ManyToOne(fetch=FetchType.LAZY)
    private EventType eventTypeID;

    @Column ( name = "EventDescription" )
    private String EventDescription;

    @Column ( name = "EventName" )
    private String EventName;

    @Column ( name = "StartDate" )
    private Date StartDate;

    @Column ( name = "EndDate" )
    private Date EndDate;

    public int getEventID() {
        return EventID;
    }

    public void setEventID(int eventID) {
        EventID = eventID;
    }

    public Venue getVenueId() {
        return venueId;
    }

    public void setVenueId(Venue venueId) {
        this.venueId = venueId;
    }

    public EventType getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(EventType eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public Event(int eventID, Venue venueId, EventType eventTypeID, String eventDescription, String eventName, Date startDate, Date endDate) {
        EventID = eventID;
        this.venueId = venueId;
        this.eventTypeID = eventTypeID;
        EventDescription = eventDescription;
        EventName = eventName;
        StartDate = startDate;
        EndDate = endDate;
    }

    public Event() {
    }
}
