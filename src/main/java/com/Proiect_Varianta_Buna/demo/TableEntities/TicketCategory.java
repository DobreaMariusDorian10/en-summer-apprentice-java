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
    private int Price;

    public void setTicketCategoryID(int ticketCategoryID) {
        TicketCategoryID = ticketCategoryID;
    }

    public void setEventID(Event eventID) {
        this.eventID = eventID;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getTicketCategoryID() {
        return TicketCategoryID;
    }

    public Event getEventID() {
        return eventID;
    }

    public String getDescription() {
        return Description;
    }

    public int getPrice() {
        return Price;
    }

    public TicketCategory() {
    }

    public TicketCategory(int ticketCategoryID, Event eventID, String description, int price) {
        TicketCategoryID = ticketCategoryID;
        this.eventID = eventID;
        Description = description;
        Price = price;
    }
}