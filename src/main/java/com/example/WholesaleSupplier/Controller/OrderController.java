package com.example.WholesaleSupplier.Controller;

import com.example.WholesaleSupplier.Model.Order;
import com.example.WholesaleSupplier.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public String save(@RequestBody Order data){
        service.save(data);
        return "Stored Successfully...";
    }

    @GetMapping("/get")
    public List<Order> getOrders(){
        return  service.getOrders();
    }

    @GetMapping("/get/{id}")
    public Optional<Order> getOrderById(@PathVariable(name="id") Long id){
        return service.getOrderById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOrderById(@PathVariable(name="id") Long id){
        service.deleteOrderById(id);
        return "This id was deleted";
    }
}
