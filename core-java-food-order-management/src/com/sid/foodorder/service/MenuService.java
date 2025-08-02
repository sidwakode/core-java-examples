package com.sid.foodorder.service;

import com.sid.foodorder.model.Menu;

import java.util.List;

public interface MenuService {
    void addMenu(Menu menu);
    Menu getMenuById(int id);
    List<Menu> getAllMenus();
    void updateMenu(Menu menu);
    void deleteMenu(int id);
}

