package com.Proiect_Varianta_Buna.demo.TableEntities;

import jakarta.persistence.*;

@Entity
@Table(name="Venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VenueID")
    private int venueID;


    @Column(name = "LocationName")
    private String locationName;


    @Column(name = "LocationType")
    private String locationType;


    @Column(name = "Capacity")
    private int capacity;

    public int getVenueID() {
        return venueID;
    }

    public void setVenueID(int venueID) {
        this.venueID = venueID;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Venue(int venueID, String locationName, String locationType, int capacity) {
        this.venueID = venueID;
        this.locationName = locationName;
        this.locationType = locationType;
        this.capacity = capacity;
    }

    public Venue() {
    }
}