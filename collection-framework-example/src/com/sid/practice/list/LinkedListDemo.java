package com.sid.practice.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<String> flowers=new LinkedList<>();

        System.out.println("size of the List: "+ flowers.size());

        if (flowers.isEmpty()){
            flowers.addAll(List.of("rose","jasmin","zendu"));

        }else {
            System.out.println("List is not empty ");
        }

        System.out.println("Now List: "+flowers);


        }
    }

