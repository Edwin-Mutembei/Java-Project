package com.codingWithEdwin;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String [] args){
//        ArrayList <Integer> arrayList = new ArrayList<Integer>(5);
          ArrayList<Integer> arrayList = new ArrayList<>(5);
//         Next: adding values to the ArrayList
        for( int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }
//        Printing elements
        System.out.println(arrayList);

//        Removing the element at index 3
        arrayList.remove(3);
//        Displaying the arraylist after deletion
        System.out.println(arrayList);

//        Printing element one by one
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//            This step of printing the element of array list can also be done using enhanced for loop
//            this can be done as follows, let first comment the previous for section
//        }
        for(int i : arrayList){
            System.out.print(i + "  ");
        }
        }
    }

