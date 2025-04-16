package com.example.WholesaleSupplier.Repository;

import com.example.WholesaleSupplier.Model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository<Menu,Long> {

}
