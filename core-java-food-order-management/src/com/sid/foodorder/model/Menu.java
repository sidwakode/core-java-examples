package com.sid.foodorder.model;

public class Menu {
    private int id;
    private int restaurantId;
    private String name;
    private String unit;        // e.g., piece, plate, etc.
    private String taste;       // e.g., spicy, sweet, etc.
    private String description;
    private double price;
    private int quantity;       // Available stock

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", restaurantId=" + restaurantId +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", taste='" + taste + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Menu(int id, int restaurantId, String name, String unit, double price, int quantity) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.quantity = quantity;
    }
}

// for taste and discription toString and Constructor optional

