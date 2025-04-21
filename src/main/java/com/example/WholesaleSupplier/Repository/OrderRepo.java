package com.example.WholesaleSupplier.Repository;

import com.example.WholesaleSupplier.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
