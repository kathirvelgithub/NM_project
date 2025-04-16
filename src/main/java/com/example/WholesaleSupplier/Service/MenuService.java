package com.example.WholesaleSupplier.Service;

import com.example.WholesaleSupplier.Repository.MenuRepo;
import com.example.WholesaleSupplier.Model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private final MenuRepo repo;

    public MenuService(MenuRepo repo) {
        this.repo = repo;
    }

    public void add(Menu obj){
        this.repo.save(obj);
    }

    public List<Menu> getItem(){
        return this.repo.findAll();
    }

    public Menu getMenuItemById(Long id){
        return this.repo.findById(id).get();
    }

    public void deleteMenuItemById(Long id) {
        this.repo.deleteById(id);
    }

    public void updatebyId(Long id,Menu obj) {
        this.repo.deleteById(id);
        this.repo.save(obj);
    }
}
