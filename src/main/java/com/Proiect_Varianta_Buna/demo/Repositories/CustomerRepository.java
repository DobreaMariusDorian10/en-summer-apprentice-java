package com.Proiect_Varianta_Buna.demo.Repositories;
import com.Proiect_Varianta_Buna.demo.TableEntities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}