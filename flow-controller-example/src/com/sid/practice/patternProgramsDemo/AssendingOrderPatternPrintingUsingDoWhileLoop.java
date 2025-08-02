package com.sid.practice.patternProgramsDemo;

public class AssendingOrderPatternPrintingUsingDoWhileLoop {
    public static void main(String[] args) {

        // We have to go with while loop

        int i=0;

        do {

            int innerCounter=0;

            while(innerCounter<=i){
                System.out.print("*\t");
                innerCounter++;
            }
            System.out.println("\n");
            i++;

        }while(i<5);

    }

}



