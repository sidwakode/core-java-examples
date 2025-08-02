package com.sidwa.operator.relational;

import java.util.Scanner;

public class EvenOddDemo {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please provide a Number");
        int num=Integer.parseInt(scanner.nextLine());

        if (num%2==0){
            System.out.println("Even");

        }else {
            System.out.println("Odd");
        }


    }
}
