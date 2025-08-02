package com.sid.foodorder.model;

import java.time.LocalDateTime;

public class OrderProcessing {

    private String id;
    private Order order;
    private DeliveryAgent deliveryAgent;
    private LocalDateTime pickupTime;
    private LocalDateTime deliveryTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return "OrderProcessing{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", deliveryAgent=" + deliveryAgent +
                '}';
    }

    public OrderProcessing(String id, Order order, DeliveryAgent deliveryAgent) {
        this.id = id;
        this.order = order;
        this.deliveryAgent = deliveryAgent;
    }
}
