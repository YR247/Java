package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class SpecifiedInsertionLinkedList {
	 public static void main(String[] args) {
		    // creating an empty linked list
		     LinkedList<String> l_list = new LinkedList<String>();
		     
		   // use adding values in linked list
		          l_list.add("Cyan");
		          l_list.add("Blue");
		          l_list.add("Black");
		          l_list.add("White");
		          l_list.add("Pink");
		
		   
		   System.out.println("Add Crimson after cyan: "+ l_list);
		   
			l_list.add(1, "Crimson");            //add crimson at index 1
			// print the list
			System.out.println("The linked list: " + l_list);
		   
 }
}


