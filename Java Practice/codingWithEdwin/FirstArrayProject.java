package com.codingWithEdwin;

import java.util.Arrays;
// import java. util.arrays class so as to use the dot operator to call the initialized variables

public class FirstArrayProject {
    public static void main(String [] args){
        int[] anArray = new int[5];
//        new int[5], allocate memory for 5 integers
//        int[], declares an array of integers
//        After declaration of an array and allocation of integers, initialize first element, second and so forth.
        anArray[0] = 10;
        anArray[1] = 20;
        anArray[2] = 30;
        anArray[3] = 40;
        anArray[4] = 50;
        System.out.println(Arrays.toString(anArray));


    }
}
