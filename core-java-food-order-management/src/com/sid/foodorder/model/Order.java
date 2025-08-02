package com.sid.foodorder.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private String id;
    private Customer customer;
    private Restaurant restaurant;
    private DeliveryAgent deliveryAgent;
    private List<Menu> menuList;   // Items ordered
    private double totalPrice;
    private double discount;
    private String deliveryAddress;
    private LocalDateTime orderTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", restaurant=" + restaurant +
                ", menuList=" + menuList +
                ", totalPrice=" + totalPrice +
                ", discount=" + discount +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }

    public Order(String id, Customer customer, Restaurant restaurant, List<Menu> menuList, String deliveryAddress) {
        this.id = id;
        this.customer = customer;
        this.restaurant = restaurant;
        this.menuList = menuList;
        this.deliveryAddress = deliveryAddress;
    }
}


