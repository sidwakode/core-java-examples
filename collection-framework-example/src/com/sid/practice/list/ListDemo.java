package com.sid.practice.list;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {

        //we are creating list of String
        String city="pune";

        //basic string delcaration with Array
        String []cities =new String[3];
        cities[0] ="mumbai";
        cities[1]="delhi";
        cities[2]="Pune";

        //string delcaration with ArrayList
        ArrayList CityList=new ArrayList();
        CityList.add("Pune");
        CityList.add("mumbai");
        CityList.add("Delhi");
        //By using ArrayList you can add any type of data and print also

        CityList.add(123);
        CityList.add(22.22);
        CityList.add(true);
        CityList.add(222233f);
        CityList.add(3983739899990099889L);

//Now we will see some concepts about the generics
        // to  avoid unmeaning full data we are using the generics concept


        ArrayList <String>GenericsCityList=new ArrayList<>();

        GenericsCityList.add("amt");
        GenericsCityList.add("kalyan");
        GenericsCityList.add("drypur");

        //once define with the generics it wii accept string type of data but except that it will give me the error
        //GenericsCityList.add(123);---> in this line we will get an error

        // but in this duplicate data allowed

        System.out.println("City:"+city);
        System.out.println("Arrays of city:"+cities);
        System.out.println("Arraylist<City>:"+CityList);
        System.out.println("Arraylist<City>:"+GenericsCityList);

    }

}
