package com.Proiect_Varianta_Buna.demo.TableEntities;
import jakarta.persistence.*;

@Entity
@Table(name="TicketCategory")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "TicketCategoryID")
    private int ticketCategoryID;


    @JoinColumn(name = "eventID", nullable = false)
    @ManyToOne(fetch=FetchType.LAZY)
    private Event eventID;


    @Column(name = "Description")
    private String description;


    @Column(name = "Price")
    private float price;

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Event getEventID() {
        return eventID;
    }

    public void setEventID(Event eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public TicketCategory() {
    }

    public TicketCategory(int ticketCategoryID, Event eventID, String description, float price) {
        this.ticketCategoryID = ticketCategoryID;
        this.eventID = eventID;
        this.description = description;
        this.price = price;
    }

    @JoinColumn(name = "EventID", nullable = false)
    @ManyToOne
    private Event event;
}