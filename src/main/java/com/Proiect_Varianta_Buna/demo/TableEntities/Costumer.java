package com.Proiect_Varianta_Buna.demo.TableEntities;
import jakarta.persistence.*;
@Entity
@Table(name = "Costumer")
public class Costumer{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column( name = "costumerID" )
    private int CustomerID;


    @Column ( name = "CostumerName" )
    private String CostumerName;


    @Column ( unique = true , name="Email")
    private String Email;

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCostumerName() {
        return CostumerName;
    }

    public void setCostumerName(String costumerName) {
        CostumerName = costumerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Costumer(int customerID, String costumerName, String email) {
        CustomerID = customerID;
        CostumerName = costumerName;
        Email = email;
    }

    public Costumer() {
    }
}
