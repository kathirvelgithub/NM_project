package com.example.WholesaleSupplier.Repository;

import com.example.WholesaleSupplier.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User , Long> {
}
