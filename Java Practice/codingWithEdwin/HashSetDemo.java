package com.codingWithEdwin;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String [] args){
        Set<String> hashSet= new HashSet<>();
//       add  method
        
        hashSet.add("A");
        hashSet.add ("B");
        hashSet.add("c");
        hashSet.add("c");
        System.out.println(hashSet);

//        Contains method  = hashSet.contains("B");
        System.out.println("Set contains c or not?" + hashSet.contains("B"));

//        Remove method   = hashSet.remove("A");
        hashSet.remove("A");
        System.out.println("Set after removing A:" + hashSet);

//        Printing items one by one using enhanced for loop ie getting the element of the hashSet

        for(String item : hashSet){
            System.out.print(item + "  ");
        }
    }

}
