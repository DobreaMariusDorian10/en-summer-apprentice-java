package com.Proiect_Varianta_Buna.demo.Services.Mapper;
import com.Proiect_Varianta_Buna.demo.Services.DTO. OrderDTO;
import com.Proiect_Varianta_Buna.demo.TableEntities.Orders;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderMapper {

    public OrderDTO convertDTO(Orders order) {
        OrderDTO orderDTO = new OrderDTO();
       // orderDTO.setEventID(order.getCustomerID().getCustomerID());
        orderDTO.setOrderedAt(order.getOrderedAt());
        //orderDTO.getTicketCategoryID(order.getTicketCategoryID().getTicketCategoryID());
        orderDTO.setOrderedAt(order.getOrderedAt());
        orderDTO.setNumberOfTickets(order.getNumberOfTickets());
        orderDTO.setTotalPrice(order.getTotalPrice());

        return orderDTO;
    }

    public List<OrderDTO> convertDTOs(List<Orders> orders) {
        List<OrderDTO> orderDTOs = new ArrayList<>();

        for (Orders order : orders) {
            orderDTOs.add(convertDTO(order));
        }
        return orderDTOs;
    }
}