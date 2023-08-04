package com.Proiect_Varianta_Buna.demo.Controller;

import com.Proiect_Varianta_Buna.demo.Repositories.OrdersRepository;
import com.Proiect_Varianta_Buna.demo.Services.DTO.OrderDTO;
import com.Proiect_Varianta_Buna.demo.Services.Implementation.OrdersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class OrdersController {

    final OrdersService ordersService;
    @GetMapping("/orderByID")
    public List<OrderDTO> getOrderByID(@RequestParam Integer customerID){
        return  ordersService.getOrderByCustomerID(customerID);
    }

}