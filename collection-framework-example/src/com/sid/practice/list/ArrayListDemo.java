package com.sid.practice.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List <String > cities=new ArrayList<>();
        cities.add("pune");
        cities.add("Mumbai");
        cities.add("delhi");

        System.out.println(":List:" +cities);
        System.out.println("---------------");

        //get method help access random element from list

        String MumbaiCity=cities.get(1);

        System.out.println("Accessed Element: "+MumbaiCity);
        System.out.println("-------------");

        //remove() method removes element from  the list
        String RemoveCity= cities.remove(1);

        System.out.println("Removed city:"+RemoveCity);
        System.out.println("Remeaminig List:"+cities);

        List<String> newCityList=new ArrayList<>();
        //AddAll(); add all the elements from one list to another
        boolean isOldListAdded= Collections.addAll(cities,"Chennai","jaipur","Kolkatta" );
        System.out.println("Old list is:"+(isOldListAdded ? "": "NOT")+ "Updated with new cities");

        System.out.println("Old City List:"+cities);

        newCityList.addAll(cities);
        // old list data added to new city list

        newCityList.add("Bangluru");
        System.out.println("Added newCityList Data:"+ newCityList);
        System.out.println("-----------------------");

        //contains() return true if specified element existed in list
         if (newCityList.contains(2)){
             //it return false becuse we dont have 2  we have chennai bandglore..

             System.out.println(2+  "Values is present in newCityList");

         }

        if (newCityList.contains("Bangluru")){
            //it return false becuse we dont have 2  we have chennai bandglore..

            System.out.println("Bangluru" +  "Values is present in newCityList");
        }
        System.out.println("------------------");

        // size mehtod return sieze of the list
        System.out.println("Size of newCityList   "+newCityList.size());
        System.out.println("-------------------------------");


// reaminng you have to  done the prog by using the screenshot



    }

}
