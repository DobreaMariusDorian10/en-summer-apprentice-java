package com.Proiect_Varianta_Buna.demo.TableEntities.DTO;
import java.util.Date;
public class OrderDTO {
    Integer eventID;
    Date orderedAt;
    int ticketCategoryID;
    float numberOfTickets;
    float totalPrice;

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getTicketCategoryID(int ticketCategoryID) {
        return this.ticketCategoryID;
    }

    public void setTicketCategoryID(Integer ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public float getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(float numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderDTO(Integer eventID, Date orderedAt, Integer ticketCategoryID, float numberOfTickets, float totalPrice) {
        this.eventID = eventID;
        this.orderedAt = orderedAt;
        this.ticketCategoryID = ticketCategoryID;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public OrderDTO() {
    }
}