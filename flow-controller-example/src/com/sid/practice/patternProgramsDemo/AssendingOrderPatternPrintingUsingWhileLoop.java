package com.sid.practice.patternProgramsDemo;

public class AssendingOrderPatternPrintingUsingWhileLoop {

    /*
          psudo code: We have to Print this pattern
          *
          **
          ***
          ****
          *****
   */
    public static void main(String[] args) {

        // We have to go with while loop

        int i=0;

        while (i<5){

            int innerCounter=0;

            while(innerCounter<=i){
                System.out.print("*\t");
                innerCounter++;
            }
            System.out.println("\n");
            i++;


        }

    }

}
 /*
 Senario1:
  if we give a statement in while loop that i<5 so it will get true and it get print continiously

  Senario2:
  if i did i++ it will print 5 line with single star
  our logic should be if flow gows on next line incremtn the star


  */

