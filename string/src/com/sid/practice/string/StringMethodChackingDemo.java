package com.sid.practice.string;

public class StringMethodChackingDemo {
    public static void main(String[] args) {


        String sentence = "Hello i am sid ";
        var wordSet = " word1 word2 word3 ";
        var space = "   ";
        var emptyString="";


        //isBlank()-identidy string is blank or not
        System.out.println("sentence.isBlank() : " +sentence.isBlank());
        System.out.println("wordSet.isBlank()  : " +wordSet.isBlank());
        System.out.println("space. isBlank()   : " +space.isBlank());
        System.out.println("-----------------------------------------");


        //isEmpty()- it will the String is empty or not , in spaces also some thing is their the black also having some value

        System.out.println("sentence.sEmpty() : " +sentence.isEmpty());
        System.out.println("wordSet.isEmpty() : " +wordSet.isEmpty());
        System.out.println("space. isEmpty()  : " +space.isEmpty());
        System.out.println("is Empty()        :"+emptyString.isEmpty() );//return true
        System.out.println("-----------------------------------------");

        //repete()- if you want a string to print multiple timese then use this method

        String repeteString="Haa  ";

        System.out.println("Repete String :"  +repeteString.repeat(5));
        // this string will repete 5 times
        System.out.println("-----------------------------------------");


        //trim ()-removse spaces from start and end

        System.out.println("before using the trim Method(): "+wordSet);
        System.out.println("After using the trim method() : "+wordSet.trim());
        //spaces got remove of start and end , middle spaces no method can remove
        System.out.println("-----------------------------------------");

        //strip()- it removes special charecters

        var speChar="\n\they sid\u2005";


        System.out.println("before using the Strip Method(): "+speChar);
        System.out.println("After using the Stripmethod() : "+speChar.strip());
        System.out.println("-----------------------------------------");
        //removes the next line charecter and also space

        System.out.println("-----------------------------------------");


        System.out.println("Before Using of StripLeading :" +speChar);
        System.out.println("After  Using of StripLeading :" +speChar.stripLeading());
        // to remove the starting special charecter

        System.out.println("Before Using of StripTrailing :" +speChar);
        System.out.println("After  Using of StripTrailing:" +speChar.stripTrailing());
        // to remove the ending special charecter
        System.out.println("-----------------------------------------");

        String multipleLines="this\nis\nmy\ntrial";
        System.out.println(multipleLines);
        //upto this if i  run meanse each word will be print on a new line to remove this use lines method

        System.out.println("After Removing next Lines :"+multipleLines.lines());
        System.out.println("-----------------------------------------");





        String city="Amt";
        String city1=new String("Amt");

        // Now we will check == object
        if( city == city1){
            System.out.println("city==city1 both are eqval");
        }else{
            System.out.println("city==city1 both are not  eqval");
        }


        //eqval method check content comparision
        if( city.equals( city1)){
            System.out.println("city.equals( city1) both are eqval");
        }else{
            System.out.println("city.equals( city1) both are not  eqval");
        }

        // to check lenght of string then use length method

        System.out.println("Lnght of the city Strinhg :" +city.length());
        System.out.println("-----------------------------------------");

// for replace anny word from the string then use the string method

        String replaceString="Akash";
        System.out.println("String before  replce :"+replaceString);
       String replace= replaceString.replace("A", "a");
        System.out.println(replace);


        String name ="Sidharth";
        System.out.println("substring " +name.substring(1,3));
        System.out.println("substring " +name.substring(4,6));


        System.out.println("Lowercase:"+name.toLowerCase());
        System.out.println("Lowercase:"+name.toUpperCase());



        String s3="wakode";
        System.out.println("After Concate:" + name.concat(s3));

        byte [] getBytes=name.getBytes();
        System.out.println(getBytes);
//end


    }
}
