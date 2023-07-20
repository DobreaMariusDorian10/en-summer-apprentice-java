package com.Proiect_Varianta_Buna.demo.TableEntities;
import jakarta.persistence.*;

import java.util.Date;

@Entity

@Table(name="Orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "OrderID")
    private int OrderID;


    @Column(name = "costumerID")
    private int costumerID;


    @Column(name = "ticketCategoryID")
    private int ticketCategoryID;


    @Column(name = "OrderedAt")
    private String OrderedAt;


    @Column(name = "NumberOfTickets")
    private int NumberOfTickets;


    @Column(name = "totalPrice")
    private int totalPrice;

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public int getCostumerID() {
        return costumerID;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public String getOrderedAt() {
        return OrderedAt;
    }

    public int getNumberOfTickets() {
        return NumberOfTickets;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public void setOrderedAt(String orderedAt) {
        OrderedAt = orderedAt;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        NumberOfTickets = numberOfTickets;
    }

    public void settotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Orders(int orderID, int costumerID, int ticketCategoryID, String orderedAt, int numberOfTickets, int totalPrice) {
        OrderID = orderID;
        this.costumerID = costumerID;
        this.ticketCategoryID = ticketCategoryID;
        OrderedAt = orderedAt;
        NumberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Orders() {
    }
}