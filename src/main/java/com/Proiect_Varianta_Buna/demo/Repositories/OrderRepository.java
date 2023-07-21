package com.Proiect_Varianta_Buna.demo.Repositories;

import com.Proiect_Varianta_Buna.demo.TableEntities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Integer> {
}