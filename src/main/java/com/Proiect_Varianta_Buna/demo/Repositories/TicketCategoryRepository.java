package com.Proiect_Varianta_Buna.demo.Repositories;

import com.Proiect_Varianta_Buna.demo.TableEntities.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory,Integer> {
}
