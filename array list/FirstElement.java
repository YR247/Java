package com.collection;

import java.util.LinkedList;
import java.util.List;

public class FirstElement {
	public static void main(String[] args) {

		//creating array list
		List<String> arlist = new LinkedList<String>();
		
		//adding element to array list
		arlist.add("Shape1");
		arlist.add("Shape2");
		System.out.println(arlist);
		
		arlist.add(0,"First Element");    //adding element at 0th index
		System.out.println(arlist);
	}

}
