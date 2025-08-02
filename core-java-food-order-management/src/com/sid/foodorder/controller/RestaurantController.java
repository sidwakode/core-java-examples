package com.sid.foodorder.controller;

import com.sid.foodorder.model.Restaurant;
import com.sid.foodorder.repository.InMemoryRestaurantRepository;
import com.sid.foodorder.service.RestaurantService;
import com.sid.foodorder.service.RestaurantServiceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantController {

    private final RestaurantService service;
    private final Scanner scanner = new Scanner(System.in);

    public RestaurantController() {
        this.service = new RestaurantServiceImpl(new InMemoryRestaurantRepository());
    }

    public void registerRestaurant() {
        System.out.println("📌 Registering new Restaurant");

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Owner First Name: ");
        String ownerFirstName = scanner.nextLine();

        System.out.print("Owner Last Name: ");
        String ownerLastName = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("FSSAI License Number: ");
        String fssai = scanner.nextLine();

        Restaurant restaurant = new Restaurant(id, name, ownerFirstName, ownerLastName, address, fssai);
        service.register(restaurant);

        System.out.println("✅ Registered: " + restaurant.getName());
    }

    public void updateRestaurantDetails() {
        System.out.print("Enter Restaurant ID to update: ");
        String id = scanner.nextLine();

        Restaurant restaurant = service.getById(id);
        if (restaurant == null) {
            System.out.println("❌ No restaurant found with ID: " + id);
            return;
        }

        System.out.print("New Address: ");
        restaurant.setAddress(scanner.nextLine());

        System.out.print("New FSSAI License: ");
        restaurant.setFssai(scanner.nextLine());

        service.update(restaurant);

        System.out.println("📝 Updated: " + restaurant);
    }

    public void displayAllRestaurants() {
        System.out.println("📋 All Registered Restaurants:");
        for (Restaurant r : service.getAll()) {
            System.out.println(r);
        }
    }
}

