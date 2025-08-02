package com.sid.foodorder.repository;

import com.sid.foodorder.model.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryMenuRepository implements MenuRepository{

    private final Map<Integer, Menu> menuMap = new HashMap<>();

    @Override
    public void save(Menu menu) {
        menuMap.put(menu.getId(), menu);
    }

    @Override
    public Menu findById(int id) {
        return menuMap.get(id);
    }

    @Override
    public List<Menu> findAll() {
        return new ArrayList<>(menuMap.values());
    }

    @Override
    public void update(Menu menu) {
        menuMap.put(menu.getId(), menu);
    }

    @Override
    public void delete(int id) {
        menuMap.remove(id);
    }
}
