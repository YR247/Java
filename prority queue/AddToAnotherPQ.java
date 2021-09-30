package com.collection;

import java.util.PriorityQueue;

public class AddToAnotherPQ {
	public static void main(String args[])
    {
		//first Priority queue
        PriorityQueue<String> pq1 = new PriorityQueue<>();
 
        pq1.add("Red");
        pq1.add("Cyan");
        pq1.add("Peach");
        pq1.add("Blue");
 
        System.out.println("First PriorityQueue: " + pq1);
        
        //second Priority queue
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        
        pq2.add("Pink");
        pq2.add("Crimson");
        pq2.add("White");
 
        System.out.println("Second PriorityQueue: " + pq2);
        
        pq1.addAll(pq2);     //adding all pq2 elements to pq1
        System.out.println("Final PriorityQueue: " + pq1);
 
    }
	

}
