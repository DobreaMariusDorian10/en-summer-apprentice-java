package com.Proiect_Varianta_Buna.demo.Controller;

import com.Proiect_Varianta_Buna.demo.TableEntities.DTO.*;
import com.Proiect_Varianta_Buna.demo.Services.OrdersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class OrdersController {
    @GetMapping("/allOrders")
    public List<OrderFeDTO> getAllOrders() {
        return ordersService.getAllOrders();
    }


    final OrdersService ordersService;
    @GetMapping("/orderByID")
    public List<OrderDTO> getOrderByID(@RequestParam Integer customerID){
        return  ordersService.getOrderByCustomerID(customerID);
    }
    @PostMapping("/placeOrder")
    public OrderDTO postOrder(@RequestBody NewOrder newOrder){
        return ordersService.placeOrder(newOrder);
    }
    @DeleteMapping("/deleteOrder/{orderID}")
    public void deleteOrder(@PathVariable Integer orderID){
        ordersService.deleteOrder(orderID);
    }

}