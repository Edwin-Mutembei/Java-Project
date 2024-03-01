package com.codingWithEdwin;


import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String [] args){
        Queue<String> queue = new PriorityQueue<>();

//            add method is used to insert element in the queue
        queue.add("Kenya");
        queue.add("Uganda");
        queue.add("Tanzania");
        System.out.println("Original queue: " + queue);
//        remove method is used to take the element out of the queue, starting with the first method
        queue.remove();
        System.out.println("Queue after removing the head element: " + queue);
//        peak method is used to view which element is the head of the queue
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);
//   poll method is used to remove the element and also return the same element
        head = queue.poll();
        System.out.println("Removed head: " + head);
        System.out.println("The remaining queue looks like this " + queue);

    }
}
