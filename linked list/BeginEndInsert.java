package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class BeginEndInsert {
	 public static void main(String[] args) {
		    // creating an empty linked list
		     LinkedList<String> l_list = new LinkedList<String>();
		     
		   // use adding values in linked list
		          l_list.add("Cyan");
		          l_list.add("Blue");
		          l_list.add("Black");
		          l_list.add("White");
		          l_list.add("Pink");
		
		   
		   System.out.println("Add Crimson in begining and Red in end of : "+ l_list);
		   
			l_list.add(0, "Crimson");            //add crimson at begining
			l_list.add(6, "Red");            //add red at the end
			// print the list
			System.out.println("The linked list: " + l_list);
		   
 }
}
