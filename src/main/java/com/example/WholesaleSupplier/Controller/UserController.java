package com.example.WholesaleSupplier.Controller;

import com.example.WholesaleSupplier.Model.User;
import com.example.WholesaleSupplier.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public String save(@RequestBody User data){
        service.save(data);
        return "stored Successfull....";
    }

    @GetMapping("/get")
    public List<User> getUserData(){
        return service.getUserData();
    }

    @GetMapping("/get/{id}")
    public Optional<User> getUserById(@PathVariable(name="id") Long id){
        return service.getUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    private String deleteUserById(@PathVariable(name="id") Long id){
        service.deleteUserById(id);
        return "This Id was deleted Successfully";
    }

}
