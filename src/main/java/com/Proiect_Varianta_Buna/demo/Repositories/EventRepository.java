package com.Proiect_Varianta_Buna.demo.Repositories;


import com.Proiect_Varianta_Buna.demo.TableEntities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    Event findByEventName(String name);
    Event findByVenueID_VenueIDAndEventTypeID_EventTypeName(int venueID,String eventTypeString);
    List<Event> findByEventTypeID_EventTypeName(String eventType);
    List<Event> findByVenueID_LocationName(String locationName);

}