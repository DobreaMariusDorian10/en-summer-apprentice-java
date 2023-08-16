package com.Proiect_Varianta_Buna.demo.Services;

import com.Proiect_Varianta_Buna.demo.Repositories.CustomerRepository;
import com.Proiect_Varianta_Buna.demo.Repositories.OrdersRepository;
import com.Proiect_Varianta_Buna.demo.Repositories.TicketCategoryRepository;
import com.Proiect_Varianta_Buna.demo.TableEntities.Customer;
import com.Proiect_Varianta_Buna.demo.TableEntities.DTO.*;
import com.Proiect_Varianta_Buna.demo.TableEntities.Event;
import com.Proiect_Varianta_Buna.demo.TableEntities.Orders;
import com.Proiect_Varianta_Buna.demo.TableEntities.TicketCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class OrdersService {

    final OrdersRepository ordersRepository;
    final CustomerRepository customerRepository;
    final TicketCategoryRepository ticketCategoryRepository;

    public List<OrderDTO> getOrderByCustomerID(Integer customerID){
        List<Orders> orders = new ArrayList<>();
        List<OrderDTO> ordersDTO = new ArrayList<>();
        ordersRepository.findAllByCustomer_CustomerID(customerID).forEach(o->orders.add(o));
        for(Orders o : orders){
            ordersDTO.add(new OrderDTO(o.getTicketCategory().getEventID().getEventID(), o.getOrderedAt(),o.getTicketCategory().getTicketCategoryID(), o.getNumberOfTickets(), o.getTotalPrice()));
        }
        return ordersDTO;
    }


    public OrderDTO placeOrder(NewOrder newOrder){
        LocalDateTime dateTime = LocalDateTime.now();
        Customer customer = customerRepository.findById(1).get();

        TicketCategory ticketCategory = ticketCategoryRepository.findTicketCategoryByEvent_EventIDAndDescription(newOrder.getEventID(), newOrder.getTicketCategoryDescription());
        System.out.println(ticketCategory.toString());

        Orders placedOrder = new Orders(customer, ticketCategory, new Date(), newOrder.getNumberOfTickets(), newOrder.getNumberOfTickets()*ticketCategory.getPrice());

        ordersRepository.save(placedOrder);

        return new OrderDTO(placedOrder.getTicketCategory().getEventID().getEventID(), placedOrder.getOrderedAt(), placedOrder.getTicketCategory().getTicketCategoryID(), placedOrder.getNumberOfTickets(), placedOrder.getTotalPrice());
    }
    public List<OrderFeDTO> getAllOrders() {
        TicketCategory ticketCategories;
        List<Orders> orders = new ArrayList<>();
        List<OrderFeDTO> orderFeDTO = new ArrayList<>();
        // Fetch all orders
        ordersRepository.findAll().forEach(o -> orders.add(o));
        // Convert Orders objects to OrderDTO objects
        for (Orders o : orders) {
            ticketCategories = ticketCategoryRepository.findTicketCategoryByTicketCategoryID(o.getTicketCategory().getTicketCategoryID());
            TicketCategoryDTO ticketCategoryDTO = new TicketCategoryDTO(ticketCategories.getTicketCategoryID(),ticketCategories.getDescription(),ticketCategories.getPrice());
            orderFeDTO.add(new OrderFeDTO(o.getTicketCategory().getEventID().getEventID(), o.getOrderedAt(), ticketCategoryDTO, o.getNumberOfTickets(), o.getTotalPrice()));
        }
        return orderFeDTO;
    }

    public void deleteOrder(Integer orderID) {
        Orders order = ordersRepository.findOrdersByOrderID(orderID);
        ordersRepository.delete(order);
    }




}