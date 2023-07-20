package com.Proiect_Varianta_Buna.demo.TableEntities;
import jakarta.persistence.*;

@Entity
@Table(name="TicketCategory")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "TicketCategoryID")
    private int TicketCategoryID;


    @JoinColumn(name = "eventID", nullable = false)
    @ManyToOne(fetch=FetchType.LAZY)
    private Event eventID;


    @Column(name = "Description")
    private String Description;


    @Column(name = "Price")
    private float Price;

    public int getTicketCategoryID() {
        return TicketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        TicketCategoryID = ticketCategoryID;
    }

    public Event getEventID() {
        return eventID;
    }

    public void setEventID(Event eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public TicketCategory() {
    }

    public TicketCategory(int ticketCategoryID, Event eventID, String description, float price) {
        TicketCategoryID = ticketCategoryID;
        this.eventID = eventID;
        Description = description;
        Price = price;
    }
}