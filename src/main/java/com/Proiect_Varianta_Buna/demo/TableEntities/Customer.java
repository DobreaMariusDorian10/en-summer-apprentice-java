package com.Proiect_Varianta_Buna.demo.TableEntities;
import jakarta.persistence.*;
@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column( name = "customerID" )
    private int CustomerID;


    @Column ( name = "CustomerName" )
    private String CustomerName;


    @Column ( unique = true , name="Email")
    private String Email;

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Customer(int customerID, String customerName, String email) {
        CustomerID = customerID;
        CustomerName = customerName;
        Email = email;
    }

    public Customer() {
    }
}
