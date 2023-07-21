package com.Proiect_Varianta_Buna.demo.Interfaces;

import com.Proiect_Varianta_Buna.demo.TableEntities.Customer;
import com.Proiect_Varianta_Buna.demo.TableEntities.Orders;

import java.util.List;

public interface IOrderService {
    List<Orders> getOrders();

    void createOrders(Orders orders);
}