package com.sid.foodorder.repository;

import com.sid.foodorder.model.Menu;

import java.util.List;

public interface MenuRepository {
        void save(Menu menu);
        Menu findById(int id);
        List<Menu> findAll();
        void update(Menu menu);
        void delete(int id);
    }

