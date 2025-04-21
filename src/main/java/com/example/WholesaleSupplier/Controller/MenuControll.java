package com.example.WholesaleSupplier.Controller;

import com.example.WholesaleSupplier.Service.MenuService;
import com.example.WholesaleSupplier.Model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuControll {

    @Autowired
    private MenuService service;

    @PostMapping("/add")
    public String add(@RequestBody Menu item ){
        service.add(item);
        return "Stored Successfully";
    }

    @GetMapping("/get")
    public List<Menu> getItem(){
        return service.getItem();
    }

    @GetMapping("/get/{id}")
    public Menu getMenuItemById(@PathVariable(name="id") Long id){
        return service.getMenuItemById(id);
    }

//    @PutMapping("/{id}")
//    public String updatebyId(@PathVariable(name="id") Long id,@RequestBody Menu item){
//        service.updatebyId(id,item);
//        return "That Item was Updated Successfully";
//    }
//

    @DeleteMapping("/delete/{id}")
    public String deleteMenuItemById(@PathVariable(name="id") Long id){
         service.deleteMenuItemById(id);
         return "Deleted Successfully";
    }


}
