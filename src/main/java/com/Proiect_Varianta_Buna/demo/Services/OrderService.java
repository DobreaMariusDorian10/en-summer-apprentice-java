package com.Proiect_Varianta_Buna.demo.Services;

import com.Proiect_Varianta_Buna.demo.Interfaces.IOrderService;
import com.Proiect_Varianta_Buna.demo.Repositories.OrderRepository;
import com.Proiect_Varianta_Buna.demo.TableEntities.Orders;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }



    @Override
    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void createOrders(Orders orders) {
        orderRepository.save(orders);
    }
}