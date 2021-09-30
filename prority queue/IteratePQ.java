package com.collection;
import java.util.*;

public class IteratePQ {
 
      // Main Method
    public static void main(String args[])
    {
        PriorityQueue<String> pq = new PriorityQueue<>();
 
        pq.add("Green");
        pq.add("Red");
        pq.add("Crimson");
        pq.add("Cyan");
 
        Iterator iterator = pq.iterator();
 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " -> ");
        }
    }
}