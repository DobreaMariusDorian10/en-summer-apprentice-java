package com.Proiect_Varianta_Buna.demo.TableEntities;
import jakarta.persistence.*;

@Entity
@Table(name="EventType")
public class EventType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    @Column ( name = "EventTypeID" )
    private int eventTypeID;


    @Column (unique = true, name = "EventTypeName" )
    private String eventTypeName;

    public int getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(int eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public EventType() {
    }

    public EventType(int eventTypeID, String eventTypeName) {
        this.eventTypeID = eventTypeID;
        this.eventTypeName = eventTypeName;
    }
}