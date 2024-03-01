package com.codingWithEdwin;

import java.util.Stack;

public class StackDemo {
    public static void main(String [] args){

        Stack<String> stack = new Stack<>();

//        push method is used to insert element or add element in a stack

        stack.push("Kenya");
        stack.push("Uganda");
        stack.push("Tanzania");

        System.out.println("Original stack: " + stack);

//        pop method is used to get element out of the stack following the LIFO order of the stack

        String poppedElement = stack.pop();
        System.out.println("Poped element: " + poppedElement);

        System.out.println("Now the stack looks like: " + stack);
//        peek method is used to view the top element in a stack

        String topElement= stack.peek();
        System.out.println(("Top element: " + topElement));

    }
}
