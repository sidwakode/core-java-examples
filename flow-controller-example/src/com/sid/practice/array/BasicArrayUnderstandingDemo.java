package com.sid.practice.array;

import java.util.List;

public class BasicArrayUnderstandingDemo {
    public static void main(String[] args) {
        //Declaration of list
        List<Integer> item=List.of(1,2,3,4,5);

        //in the for each block firsrt we have to write what type of object list containing ex.int, then local variable then list variable name

        for (Integer i: item){
            System.out.println("Iteams:"+i);

        }
    }
}




