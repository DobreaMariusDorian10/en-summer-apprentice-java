package com.Proiect_Varianta_Buna.demo.Controller;

import com.Proiect_Varianta_Buna.demo.TableEntities.DTO.*;
import com.Proiect_Varianta_Buna.demo.Services.OrdersService;
import com.Proiect_Varianta_Buna.demo.TableEntities.Orders;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class OrdersController {
    final OrdersService ordersService;

    @GetMapping("/allOrders")
    public List<OrderFeDTO> getAllOrders() {
        return ordersService.getAllOrders();
    }

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

    @PatchMapping("/patchOrder")
    public OrderFeDTO patchOrder(@RequestBody OrderPatchDTO orderDTO) {
        OrderFeDTO order = ordersService.patchOrder(orderDTO);
        return order;
    }
}