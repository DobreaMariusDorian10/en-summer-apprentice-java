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

    public Event(int eventID, Venue venueId, EventType eventTypeID, String eventDescription, String eventName, Date startDate, Date endDate) {
        EventID = eventID;
        this.venueId = venueId;
        this.eventTypeID = eventTypeID;
        EventDescription = eventDescription;
        EventName = eventName;
        StartDate = startDate;
        EndDate = endDate;
    }

    public int getEventID() {
        return EventID;
    }

    public Venue getVenueId() {
        return venueId;
    }

    public EventType getEventTypeID() {
        return eventTypeID;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public String getEventName() {
        return EventName;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEventID(int eventID) {
        EventID = eventID;
    }

    public void setVenueId(Venue venueId) {
        this.venueId = venueId;
    }

    public void setEventTypeID(EventType eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }
}
