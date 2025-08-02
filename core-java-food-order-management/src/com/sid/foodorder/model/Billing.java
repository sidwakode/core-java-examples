package com.sid.foodorder.model;

public class Billing {
    private String id;
    private Order order;
    private double totalTax;
    private double totalBill;   // totalPrice + tax - discount

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

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", totalTax=" + totalTax +
                ", totalBill=" + totalBill +
                '}';
    }

    public Billing(String id, Order order) {
        this.id = id;
        this.order = order;
    }
}


