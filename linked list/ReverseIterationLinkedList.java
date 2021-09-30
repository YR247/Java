package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterationLinkedList {
	  public static void main(String[] args) {
		    // creating an empty linked list
		     LinkedList<String> l_list = new LinkedList<String>();
		     
		   // use adding values in linked list
		          l_list.add("Cyan");
		          l_list.add("Blue");
		          l_list.add("Black");
		          l_list.add("White");
		          l_list.add("Pink");
		
		   Iterator q = l_list.listIterator();  
		   System.out.println("Elements in Original Order:");//iterate all values
		   while (q.hasNext()) {
			   System.out.println(q.next());}

		   Iterator it = l_list.descendingIterator();

		   System.out.println("\nElements in Reverse Order:"); //iterate values in reverse
		   while (it.hasNext()) {
			   System.out.println(it.next());
    }
}
}
