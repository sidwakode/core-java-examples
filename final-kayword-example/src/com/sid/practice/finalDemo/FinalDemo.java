package com.sid.practice.finalDemo;

public class FinalDemo {


        public final String GREETING_MASSAGE="hello Sir..";
        public final int DEFAULT_LOAD= 10;
        public final double DEAFULT_TEMPRETURE=10.4;
        public final char DEAFULT_CHAR='a';
        public final  static String GREETING_MASSAGE_TO_WORDLD="Hello World";

    public static void main(String[] args) {
        FinalDemo finalDemo= new FinalDemo();

        //below variable non static we need object and reference
        System.out.println("Msg:"+finalDemo.GREETING_MASSAGE);

       //below Variable is static so we can use it Directly
        System.out.println("Msg:"+GREETING_MASSAGE_TO_WORDLD);

        finalDemo.printMsg();
        //this is the method calling by object reference in main method
    }

    public void printMsg() {

        System.out.println("Msg:"+GREETING_MASSAGE);

    }
}
