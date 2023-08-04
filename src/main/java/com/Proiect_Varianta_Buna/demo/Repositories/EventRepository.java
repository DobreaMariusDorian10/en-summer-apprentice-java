package com.Proiect_Varianta_Buna.demo.Repositories;


import com.Proiect_Varianta_Buna.demo.TableEntities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    Event findByEventName(String name);
    Event findByVenueID_VenueIDAndEventTypeID_EventTypeName(int venueID,String eventTypeString);
}