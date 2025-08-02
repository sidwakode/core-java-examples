package com.sid.practice.string;


public class StringDemo {
    public static void main(String[] args) {
        //String city="Amt";

        String city1=new String("Amt");

       // System.out.println(city);
        System.out.println(city1);
        System.out.println(city1.hashCode());


        city1=new String("amravati");
        System.out.println(city1.hashCode());
        System.out.println("---------------------------------");

        // StringBuffer is used for Non multithred application
//String builder never create the multiple object
        StringBuilder greet=new StringBuilder("hello");
        System.out.println("greetObject " +greet);
        System.out.println("HAshcode of sb : "+greet.hashCode());
        greet.append("Good Morning");

        System.out.println("greetObject " +greet);
        System.out.println("HAshcode of updated SB:" +greet.hashCode());

        System.out.println("-----------------------------------------------");


        StringBuffer stringBuffer=new StringBuffer("Hi ");
        System.out.println("Cureent SB object :" +stringBuffer);
        System.out.println("-----------------------------------------------");

        stringBuffer.append(" How are you  :");

        System.out.println("Present sb Object With changes : " +stringBuffer);

        System.out.println("-----------------------------------------------");



    }
}
/*
string object:
 temporary memory meanse RAM, concider JDk is using 1gb from Ram right now
we segrigate 1 gb to 200mb , 200mb like that , we have 5 part of memory
variable we are using new oparator they are created in eden madhe create hotat
tempory memory mdhe , je ooperator lavkr  stop honare astat te eden mdhe store hotat
is like in tempory memory

if we are  using litral while declartion so it is going to store in the heap memory directly
for a long run string s="sss";

heap memory clean karne is comple as compare to eden
accesing the heap variable is easy

short running application then declare with  new
long run sathi litral use kara



mutable and immutable:

 if changes allow then mutable
 if changes not allow immutable




         when i created city1 with amt it got declared in eden then when i make changes
        so as part of immutability new object got created with the chnages
        // in the case of immutable exiting object never change with the changes new object get created
 if you want freqvent chabges string then go for stringbuilder

 */

