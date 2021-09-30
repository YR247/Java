package com.collection;
import java.util.*;
 
public class RemovePQ {
 
    public static void main(String args[])
    {
        PriorityQueue<String> pq = new PriorityQueue<>();
 
        pq.add("Red");
        pq.add("Cyan");
        pq.add("Blue");
 
        System.out.println("Initial PriorityQueue: " + pq);
 
          
        pq.remove("Red");       //removing one element from pq
        System.out.println("After removal: " + pq);
        
        pq.clear();            //clearing the queue
        System.out.println("Final Priority Queue: " + pq);
    }
}