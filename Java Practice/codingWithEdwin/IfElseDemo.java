package com.codingWithEdwin;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your test score: ");
        int testScore = scanner.nextInt();
        char grade;

            if (testScore >= 90)
                grade = 'A';
            else if (testScore >= 80)
                grade = 'B';
            else if (testScore >= 70)
                grade = 'C';
            else if (testScore >= 60)
                grade = 'D';
            else
                grade = 'E';
                System.out.println("You Scored a " + grade);

    }
}
