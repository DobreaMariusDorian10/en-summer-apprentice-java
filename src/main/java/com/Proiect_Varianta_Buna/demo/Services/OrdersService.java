package com.Proiect_Varianta_Buna.demo.Services;

import com.Proiect_Varianta_Buna.demo.Repositories.OrdersRepository;
import com.Proiect_Varianta_Buna.demo.TableEntities.DTO.OrderDTO;
import com.Proiect_Varianta_Buna.demo.TableEntities.Orders;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OrdersService {

    final OrdersRepository ordersRepository;
    public List<OrderDTO> getOrderByCustomerID(Integer customerID){
        List<Orders> orders = new ArrayList<>();
        List<OrderDTO> ordersDTO = new ArrayList<>();
        ordersRepository.findAllByCustomer_CustomerID(customerID).forEach(o->orders.add(o));
        for(Orders o : orders){
            ordersDTO.add(new OrderDTO(o.getTicketCategory().getEventID().getEventID(), o.getOrderedAt(),o.getTicketCategory().getTicketCategoryID(), o.getNumberOfTickets(), o.getTotalPrice()));
        }
        return ordersDTO;
    }

}