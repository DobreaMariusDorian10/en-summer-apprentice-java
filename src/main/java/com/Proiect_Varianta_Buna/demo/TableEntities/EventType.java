package com.Proiect_Varianta_Buna.demo.TableEntities;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.persistence.*;

@Entity
@Table(name="EventType")
public class EventType {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    @Column ( name = "EventTypeID" )
    private int EventTypeID;


    @Column (unique = true, name = "EventTypeName" )
    private String EventTypeName;

    public int getEventTypeID() {
        return EventTypeID;
    }

    public void setEventTypeID(int eventTypeID) {
        EventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return EventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        EventTypeName = eventTypeName;
    }

    public EventType() {
    }

    public EventType(int eventTypeID, String eventTypeName) {
        EventTypeID = eventTypeID;
        EventTypeName = eventTypeName;
    }
}
