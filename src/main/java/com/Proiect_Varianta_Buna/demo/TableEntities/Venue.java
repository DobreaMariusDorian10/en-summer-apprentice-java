package com.Proiect_Varianta_Buna.demo.TableEntities;

import jakarta.persistence.*;

@Entity
@Table(name="Venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "VenueID")
    private int VenueID;


    @Column(name = "LocationName")
    private String LocationName;


    @Column(name = "LocationType")
    private String LocationType;


    @Column(name = "Capacity")
    private int Capacity;

    public Venue(int venueID, String locationName, String locationType, int capacity) {
        VenueID = venueID;
        LocationName = locationName;
        LocationType = locationType;
        Capacity = capacity;
    }

    public Venue() {
    }

    public int getVenueID() {
        return VenueID;
    }

    public String getLocationName() {
        return LocationName;
    }

    public String getLocationType() {
        return LocationType;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setVenueID(int venueID) {
        VenueID = venueID;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }

    public void setLocationType(String locationType) {
        LocationType = locationType;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
}