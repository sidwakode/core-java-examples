package com.sid.practice.map;

import javax.sound.midi.spi.SoundbankReader;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> cityMap = new HashMap<>();
        cityMap.put(1, "Pune");
        cityMap.put(2, "Mumbai");
        cityMap.put(3, "Delhi");

        System.out.println("CityMap: " +cityMap);
        System.out.println("------------------");

        cityMap.put(3, "Kolkatta");
        System.out.println("After changing the value with the existed key: " +cityMap);
        //The concept with hashmap is if with new value if you provided with the exiting key then value will get replace with the existing key

//        get
        System.out.println("Object provided by by 1st key :" +cityMap.get(1));
        System.out.println("Object provided by by 2nd key :" +cityMap.get(2));
        System.out.println("Object provided by by 3rd key :" +cityMap.get(3));
        System.out.println("------------------------------------------------");

//        size()-retrive size of the map
        System.out.println("size of the map: "+cityMap.size());
        System.out.println("------------------------------------------------");

//        containsKey()-check perticulur  key present or not
        if (cityMap.containsKey(2)){
             System.out.println("Key 4 is present :" +cityMap.get(2));
         }else
         {
             System.out.println("key 4 is not present");
         }
        System.out.println("------------------------------------------------");

//        containsValue()
        if (cityMap.containsValue("Pune")){
            System.out.println("Pune is present :");
        }else
        {
            System.out.println("Pune is not present");
        }
        System.out.println("------------------------------------------------");



//        containsValue()
        if (cityMap.containsValue("Amt")){
            System.out.println("Amt is present :");
        }else
        {
            System.out.println("Amt is not present");
        }
        System.out.println("------------------------------------------------");

//        keyset()- return set of keys
        System.out.println("keys<CityMap>" +cityMap.keySet());

        //values()- return values in the present map
        System.out.println("Values <CityMap> : " +cityMap.values());
        System.out.println("------------------------------------------------");

        Iterator<String> iterator=cityMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println("Next Value ;" +iterator.next());

        }

        System.out.println("------------------------------------------------");
//
//
//        entryset()- return entry in key and pair format
        Set<Map.Entry <Integer ,String>> entrySet=cityMap.entrySet();
        for(Map.Entry<Integer, String> entry: entrySet){
            System.out.println(" key: "+entry.getKey() + "| "+entry.getValue());

        }
        System.out.println("------------------------------------------------");

//        putAll()
        Map<Integer, String > tempCity=Map.of(4,"amt", 5,"ngp");
        cityMap.putAll(tempCity);
        System.out.println("After PutAll():" +cityMap);


        //  remove()
        String removeByKay= cityMap.remove(5);
        System.out.println(" Removed  Key: "+removeByKay);
        System.out.println("Keys present in CityMap after Remove(): "+cityMap);
        System.out.println("------------------------------------------------");


        Enumeration<String> stringEnumeration=Collections.enumeration(cityMap.values());
        while(stringEnumeration.hasMoreElements()){
            System.out.println("Next Element "+ stringEnumeration.nextElement());

        }
        System.out.println("------------------------------------------------");

//        clear()
        System.out.println("Before clear the map: " + cityMap);
        cityMap.clear();
        System.out.println("After clear the Map:" +cityMap);




    }
}
