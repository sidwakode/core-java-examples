package com.sidwa.operator.increment;

import java.util.Scanner;

public class DecrementOperatorDemo {
    public static void main(String[] args) {
        /*
    psudo code;
    accept 2 value from the user
    Decremeted the value by 1
     */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the value");
        int value=Integer.parseInt(scanner.nextLine());
        System.out.println("Decremented  value: "+(value-1));

    }
}

