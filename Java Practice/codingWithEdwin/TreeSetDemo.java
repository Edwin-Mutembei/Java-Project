package com.codingWithEdwin;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String [] args){
        TreeSet<String> treeSet = new TreeSet<>();

//        using add method in TreeSet

        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("C");
        System.out.println(treeSet);

//        It always maintains the natural order when sorting ie A,B,C....
//        Unlike hashSet which produces numbers radomly after each implementation ie A,B,C.., B,A,C... ETC

    }
}
