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

    public EventType(int EventTypeID, String EventTypeName) {
        EventTypeID = EventTypeID;
        EventTypeName = EventTypeName;
    }

    public EventType() {

    }

    public int getEventTypeID() {
        return EventTypeID;
    }

    public String getEventTypeName() {
        return EventTypeName;
    }

    public void setEventTypeID(int EventTypeID) {
        EventTypeID = EventTypeID;
    }

    public void setEventTypeName(String EventTypeName) {
        EventTypeName = EventTypeName;
    }
}
