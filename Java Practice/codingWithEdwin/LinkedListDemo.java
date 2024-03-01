package com.codingWithEdwin;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<>();
//  Adding element
        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");
        System.out.println(list);

//        Removing element in a LinkedList

        list.remove("B");
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);


    }
}