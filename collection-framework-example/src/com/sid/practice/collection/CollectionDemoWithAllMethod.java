package com.sid.practice.collection;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemoWithAllMethod {
    public static void main(String[] args) {
        List<Integer> NumberList = new ArrayList<>();
//        NumberList.add(123);
//        NumberList.add(456);
//        NumberList.add(12);
//        NumberList.add(13);
//        NumberList.add(12);

        // also you can do like this with AddAll()method
        Collections.addAll(NumberList ,11,55,44,78,16,24,33,15);
        System.out.println(" List<Integer>:" + NumberList);

        // from this list i need Assending order for that we can you sort method
        Collections.sort(NumberList);
        System.out.println(" Sort<Integer>:" + NumberList);
// i need  minimum nummber from the list and max number from the list

        System.out.println("Minimum Number From the List  " + Collections.min(NumberList));
        System.out.println("Maximum Number From the List  " + Collections.max(NumberList));


        System.out.println("------------------------");

        //We can reverce the list by using the reverce method\
        Collections.reverse(NumberList);
        System.out.println("Reverse List: "+ NumberList);
        System.out.println("------------------------");

// We can swap the numbers
        Collections.swap(NumberList, 0, 2);
        System.out.println("After Swapping List: "+ NumberList);
// we can replace this existing value from some other value

       boolean isReplaced= Collections.replaceAll(NumberList, 44,11);
        if (isReplaced){
            System.out.println("Replaced values: "+NumberList);
        }else{
            System.out.println("Nothing was replced here is the list: "+NumberList);
        }
        System.out.println("------------------------------------------");
        Collections.shuffle(NumberList);
        System.out.println("Shuffled vaues : "  +NumberList);

        //we can rotate the value also , logic behind the rotate is it by giving distance it pick the groups and print thoes Accordingly

        System.out.println("------------------------------------------");
        Collections.rotate(NumberList, 2);
        System.out.println("rotated  vaues : "  +NumberList);

        //we can make a copies of the list also

        System.out.println("------------------------------------------");
        List<List <Integer>> copiesOfTwo=Collections.nCopies(2, NumberList);

        System.out.println("Number List:" +NumberList);
        System.out.println( "Two COppies of NumberList: " +copiesOfTwo);
        //Done


    }
}


