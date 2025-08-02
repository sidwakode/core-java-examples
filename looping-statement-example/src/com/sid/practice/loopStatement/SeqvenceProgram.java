package com.sid.practice.loopStatement;
public class SeqvenceProgram {
    /*
    Psudo code:
    1.initilze the varible
    2. increment the number
    3.write a print statement to print number
    4.add above code in the loop

     */
    public static void main(String[] args) {
          int no = 0;
        System.out.println("Output with the While loop ");
        while (no <= 10) {
            System.out.println("No:"+no);
            no++;

        }
        no=0;
        System.out.println("Output with the While loop ");
        do {

            System.out.println("No:"+no);
            no++;

        } while (no <= 10);

    }
}

/*
#Working of While Loop
senario1:

        int no=0;
        System.out.println("Number:" +no);
        * here o print one time
        no++;
        System.out.println("Number:" +no);
        * here we get 1 as one time
         above senario if i want to print upto 10 so 10 time sop i have to Write

 #Senario2:
        if (no<=10){
            System.out.println("Number:" +no);
             //once this statement got true meane it will print only one time
            //so that we have to add the looping statement
            # instied of loop if we have meanse statement got true and run multiple times
    #Senario3:

     while (no <= 10) {
            System.out.println("No:"+no);
             #  If We use While  Loop meanse statement got true and run multiple times
 senario4:

  int no = 0;
         while (no <= 10) {
            System.out.println("No:"+no);
            no++;
            if num ++ we did then go right

            Conclusion for the While Loop ,is
             num initially 0 go to  while statement 0<=10 true
              then SOP statment got printed
              flow goes to  no++(Here Value will not increse , when flow go back to no , then no valaue became 1)
              again statement got change upto 10 once got Statement fail then  flow goes out
               ** if condition got true then only run the code snipet , but my requirment is one time my code got to excecute the
                We have to go  for Do-While


 */
