package com.codingWithEdwin;

import java.util.Scanner;

// Enhanced switch
public class SwitchDemo2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the month number: ");
         int month = scanner.nextInt();
         String monthOfTheYear;
        switch (month) {
            case 1:
                monthOfTheYear = "January";
                break;
            case 2:
                monthOfTheYear = "February";
                break;
            case 3:
                monthOfTheYear = "March";
                break;
            case 4:
                monthOfTheYear = "April";
                break;
            case 5:
                monthOfTheYear = "May";
                break;
            case 6:
                monthOfTheYear = "June";
                break;
            case 7:
                monthOfTheYear = "July";
                break;
            case 8:
                monthOfTheYear = "August";
                break;
            case 9:
                monthOfTheYear = "September";
                break;
            case 10:
                monthOfTheYear = "October";
                break;
            case 11:
                monthOfTheYear = "November";
                break;
            case 12:
                monthOfTheYear = "December";
                break;
            default:
                monthOfTheYear = "Invalid Month";
                break;
        }
        System.out.println("Hello, the chosen month is " + monthOfTheYear);
    }


}





