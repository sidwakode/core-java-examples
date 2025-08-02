package com.sid.foodorder.service;

import com.sid.foodorder.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuServiceImpl implements MenuService{
    private List<Menu> menuList = new ArrayList<>();

    @Override
    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    @Override
    public Menu getMenuById(int id) {
        return menuList.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuList;
    }

    @Override
    public void updateMenu(Menu updatedMenu) {
        for (int i = 0; i < menuList.size(); i++) {
            if (menuList.get(i).getId() == updatedMenu.getId()) {
                menuList.set(i, updatedMenu);
                break;
            }
        }
    }

    @Override
    public void deleteMenu(int id) {
        menuList.removeIf(m -> m.getId() == id);
    }
}

