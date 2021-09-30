package com.collection;

import java.util.LinkedList;
import java.util.List;

public class UpdateElement {
	public static void main(String[] args) {

		//creating array list
		List<String> arlist = new LinkedList<String>();
		
		//adding element to array list
		arlist.add("Shape1");
		arlist.add("Shape2");
		System.out.println(arlist);
		
		arlist.set(0, "Replaced Element");
		System.out.println(arlist);
	}

}
