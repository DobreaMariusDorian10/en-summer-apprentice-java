package com.Proiect_Varianta_Buna.demo.Repositories;

import com.Proiect_Varianta_Buna.demo.TableEntities.EventType;
import org.springframework.data.repository.CrudRepository;

public interface EventTypeRepository  extends CrudRepository<EventType, Integer> {
    EventType findByEventTypeID(Integer eventTypeID);
    EventType findEventTypeByEventTypeID(Integer eventTypeID);
}