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


    @Column(name = "customerID")
    private int customerID;


    @Column(name = "ticketCategoryID")
    private int ticketCategoryID;


    @Column(name = "OrderedAt")
    private Date OrderedAt;


    @Column(name = "NumberOfTickets")
    private float NumberOfTickets;


    @Column(name = "totalPrice")
    private float totalPrice;

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public Date getOrderedAt() {
        return OrderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        OrderedAt = orderedAt;
    }

    public float getNumberOfTickets() {
        return NumberOfTickets;
    }

    public void setNumberOfTickets(float numberOfTickets) {
        NumberOfTickets = numberOfTickets;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Orders() {
    }

    public Orders(int orderID, int customerID, int ticketCategoryID, Date orderedAt, float numberOfTickets, float totalPrice) {
        OrderID = orderID;
        this.customerID = customerID;
        this.ticketCategoryID = ticketCategoryID;
        OrderedAt = orderedAt;
        NumberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }
}