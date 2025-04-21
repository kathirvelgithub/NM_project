package com.example.WholesaleSupplier.Service;

import com.example.WholesaleSupplier.Model.Order;
import com.example.WholesaleSupplier.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private final OrderRepo repo;

    public OrderService(OrderRepo repo) {
        this.repo = repo;
    }

    public void save(Order data) {
         repo.save(data);
    }

    public List<Order> getOrders() {
        return repo.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return  repo.findById(id);
    }

    public void deleteOrderById(Long id) {
        repo.deleteById(id);
    }
}
