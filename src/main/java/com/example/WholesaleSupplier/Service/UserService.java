package com.example.WholesaleSupplier.Service;

import com.example.WholesaleSupplier.Model.User;
import com.example.WholesaleSupplier.Repository.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final Userrepo repo;

    public UserService(Userrepo repo) {
        this.repo = repo;
    }

    public void save(User data) {
        repo.save(data);

    }

    public List<User> getUserData() {
        return repo.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return repo.findById(id);
    }

    public void deleteUserById(Long id) {
        repo.deleteById(id);
    }
}
