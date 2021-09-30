package com.collection;
import java.util.*;

class PriorityQueuePQ {

	 public static void main(String args[])
	 {
     // Creating new priority queue
		 PriorityQueue<String> pq = new PriorityQueue<String>();

     // Adding items to the pq using add()
		 pq.add("Peach");
		 pq.add("Cyan");
		 pq.add("Crimson");
		 
		 System.out.println("Priority Queue: "+pq);
	 }
}