package com.collection;

import java.util.LinkedList;
import java.util.List;

public class RetrieveElement {
	public static void main(String[] args) {

		//creating array list
		List<String> arlist = new LinkedList<String>();
		
		//adding element to array list
		arlist.add("Shape1");
		arlist.add("Shape2");
		System.out.println(arlist);
		
		String retrieve = arlist.get(1);   //retrieve element at index 1
		System.out.println("Retrieved element is: "+retrieve);
	}

}
