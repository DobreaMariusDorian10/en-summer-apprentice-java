package com.Proiect_Varianta_Buna.demo.TableEntities;
import jakarta.persistence.*;
@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column( name = "customerID" )
    private int customerID;


    @Column ( name = "CustomerName" )
    private String customerName;


    @Column ( unique = true , name="Email")
    private String email;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(int customerID, String customerName, String email) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
    }

    public Customer() {
    }
}