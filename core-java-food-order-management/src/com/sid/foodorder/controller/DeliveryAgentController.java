package com.sid.foodorder.controller;

import com.sid.foodorder.model.DeliveryAgent;
import com.sid.foodorder.service.DeliveryAgentService;

import java.util.Scanner;

public class DeliveryAgentController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeliveryAgentService service = new DeliveryAgentService();

        System.out.println("📌 Registering new Delivery Agent");
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("First Name: ");
        String first = sc.nextLine();

        System.out.print("Last Name: ");
        String last = sc.nextLine();

        System.out.print("Mobile: ");
        String mobile = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("KYC Details: ");
        String kyc = sc.nextLine();

        DeliveryAgent agent = new DeliveryAgent(id, first, last, mobile, address, kyc);
        service.registerAgent(agent);

        System.out.print("Enter Delivery Agent ID to update: ");
        String updateId = sc.nextLine();

        System.out.print("New Mobile: ");
        String newMobile = sc.nextLine();

        System.out.print("New Address: ");
        String newAddress = sc.nextLine();

        System.out.print("New KYC: ");
        String newKyc = sc.nextLine();

        service.updateAgent(updateId, newMobile, newAddress, newKyc);

        System.out.println("📋 All Registered Delivery Agents:");
        service.showAllAgents();

        sc.close();
    }

}
