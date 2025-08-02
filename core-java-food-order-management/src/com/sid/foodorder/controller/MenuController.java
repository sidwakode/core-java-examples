package com.sid.foodorder.controller;

import com.sid.foodorder.model.Menu;
import com.sid.foodorder.service.MenuService;
import com.sid.foodorder.service.MenuServiceImpl;

import java.util.List;

public class MenuController {
    private final MenuService menuService = new MenuServiceImpl();

    public void addMenu(Menu menu) {
        menuService.addMenu(menu);
        System.out.println("Menu item added!");
    }

    public Menu getMenuById(int id) {
        return menuService.getMenuById(id);
    }

    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    public void updateMenu(Menu menu) {
        menuService.updateMenu(menu);
        System.out.println("Menu item updated!");
    }

    public void deleteMenu(int id) {
        menuService.deleteMenu(id);
        System.out.println("Menu item deleted!");
    }
}

