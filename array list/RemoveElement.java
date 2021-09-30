package com.collection;

import java.util.LinkedList;
import java.util.List;

public class RemoveElement {
	public static void main(String[] args) {

		//creating array list
		List<String> arlist = new LinkedList<String>();
		
		//adding element to array list
		arlist.add("Shape1");
		arlist.add("Shape2");
		arlist.add("Shape3");
		arlist.add("Shape4");
		System.out.println(arlist);
		
		arlist.remove(3);      //-----------remove element at index 3
		System.out.println(arlist);
	}

}
