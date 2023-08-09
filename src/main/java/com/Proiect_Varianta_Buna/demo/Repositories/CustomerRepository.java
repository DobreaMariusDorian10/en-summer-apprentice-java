package com.Proiect_Varianta_Buna.demo.Repositories;
import com.Proiect_Varianta_Buna.demo.TableEntities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}