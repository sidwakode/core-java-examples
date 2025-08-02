package com.sidwa.operator.eqvality;

import java.util.Scanner;

public class NotEqvalToOperatorDemo {

/*
if number is not eqval to 100  or not
 ? print good number
  else bad number


 */
public static void main(String[] args) {
    System.out.println("Please Enter the value");

    Scanner scanner= new Scanner(System.in);
    String input= scanner.nextLine();

     if (Integer.parseInt(input)!=100){
         System.out.println("Non matching  non sentury");

     }
     else {
         System.out.println("Matching  Century");

     }

}
}
