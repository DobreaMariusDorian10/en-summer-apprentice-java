package com.Proiect_Varianta_Buna.demo.Repositories;

import com.Proiect_Varianta_Buna.demo.TableEntities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Integer> {
}