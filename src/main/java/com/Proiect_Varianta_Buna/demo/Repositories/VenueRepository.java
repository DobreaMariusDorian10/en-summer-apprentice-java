package com.Proiect_Varianta_Buna.demo.Repositories;

import com.Proiect_Varianta_Buna.demo.TableEntities.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue,Integer> {
}