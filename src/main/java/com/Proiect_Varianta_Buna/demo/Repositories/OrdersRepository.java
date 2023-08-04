package com.Proiect_Varianta_Buna.demo.Repositories;

import com.Proiect_Varianta_Buna.demo.TableEntities.Orders;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
    @Repository
    public interface OrdersRepository extends CrudRepository<Orders, Integer> {
        List<Orders> findAllByCustomer_CustomerID(Integer CustomerID);
        List<Orders> findOrdersByCustomer_CustomerID(Integer id);

    }

