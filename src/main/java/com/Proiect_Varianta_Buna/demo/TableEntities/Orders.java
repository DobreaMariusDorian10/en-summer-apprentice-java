package com.Proiect_Varianta_Buna.demo.TableEntities;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity

@Table(name="Orders")
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;

        @ManyToOne
        @JoinColumn(name = "CustomerID")
        private Customer customer;

    @ManyToOne
    @JoinColumn(name = "TicketCategoryID")
    private TicketCategory ticketCategory;


    @Column(name = "OrderedAt")
    private Date orderedAt;


    @Column(name = "NumberOfTickets")
    private float numberOfTickets;


    @Column(name = "totalPrice")
    private float totalPrice;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }



    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
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

    public Orders() {
    }



    public Orders(Customer customer, TicketCategory ticketCategory, Date orderedAt, float numberOfTickets, float totalPrice) {
        this.customer = customer;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }
}