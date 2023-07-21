package com.Proiect_Varianta_Buna.demo.Repositories;

import com.Proiect_Varianta_Buna.demo.TableEntities.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTypeRepository extends JpaRepository<EventType,Integer> {
}