package com.sid.practice.projectSample;

import com.sid.practice.projectSample.model.Costomer;

import java.util.Scanner;

public class BookingDemoOverDoWhileLoop {
   static Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) {
        BookingDemoOverDoWhileLoop bookingDemoOverDoWhileLoop=new BookingDemoOverDoWhileLoop();

        int option=0;

        do {
            System.out.println("**** Restorent Management System ****");
            System.out.println(" Please Choose option:");
            System.out.println("1. Create costomer");
            System.out.println("2. Create delevery Agent");
            System.out.println("3. Create restorent");
            System.out.println("4. Create odrer");
            System.out.println("0. Exit Project");
            option=Integer.parseInt(scanner.nextLine());

            if (option ==1){
                Costomer costomer=bookingDemoOverDoWhileLoop.createCostomer();
                System.out.println("Costomer Created: "+costomer);
            }


        }while (option !=0);

    }

    private Costomer createCostomer(){
        System.out.println("please enter id");
        int id=Integer.parseInt(scanner.nextLine());

        System.out.println("please enter name ");
        String name=scanner.nextLine();

        System.out.println("city");
        String city=scanner.nextLine();


        Costomer costomer=new Costomer();

        costomer.setId(id);
        costomer.setName(name);
        costomer.setCity(city);
        return costomer;



    }


}
