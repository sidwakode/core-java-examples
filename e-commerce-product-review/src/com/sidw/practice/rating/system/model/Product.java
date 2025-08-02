package com.sidw.practice.rating.system.model;

public class Product {
    public int id;
    public String name;
    public Double price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
