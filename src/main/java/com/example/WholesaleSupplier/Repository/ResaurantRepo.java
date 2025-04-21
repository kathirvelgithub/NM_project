package com.example.WholesaleSupplier.Repository;

import com.example.WholesaleSupplier.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResaurantRepo extends JpaRepository<Restaurant,Long> {
}
