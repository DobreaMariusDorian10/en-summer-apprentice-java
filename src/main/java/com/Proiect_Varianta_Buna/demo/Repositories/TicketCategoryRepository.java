package com.Proiect_Varianta_Buna.demo.Repositories;

import com.Proiect_Varianta_Buna.demo.TableEntities.TicketCategory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory, Integer> {

    List<TicketCategory> findTicketCategoriesByEvent_EventID(Integer id);

    TicketCategory findTicketCategoryByEvent_EventNameAndDescription(String eventName, String description);

}