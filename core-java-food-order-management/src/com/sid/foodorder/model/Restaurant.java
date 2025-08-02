package com.sid.foodorder.model;

import java.util.List;

public class Restaurant {
    private String id;
    private String name;
    private String ownerFirstName;
    private String ownerLastName;
    private String address;
    private String fssai; // License Number
    private List<Menu> menuList; // Menu items offered by this restaurant

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFssai() {
        return fssai;
    }

    public void setFssai(String fssai) {
        this.fssai = fssai;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerLastName='" + ownerLastName + '\'' +
                ", address='" + address + '\'' +
                ", fssai='" + fssai + '\'' +
                '}';
    }

    public Restaurant(String id, String name, String ownerFirstName, String ownerLastName, String address, String fssai) {
        this.id = id;
        this.name = name;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.address = address;
        this.fssai = fssai;
    }
}
