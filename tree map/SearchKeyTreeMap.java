package com.collection;

import java.util.TreeMap;

public class SearchKeyTreeMap {
	public static void main(String args[]){ 
		
		  // Creating an empty tree map
		  TreeMap<Integer,String> tm=new TreeMap<Integer,String>();   
		   
		  // Putting elements to the tree map 
		  tm.put(1, "Pink");
		  tm.put(2, "Lime");
		  tm.put(3, "Peach");
		  tm.put(4, "Crimson");
		  
		  if(tm.containsKey(3)){
	            System.out.println("The Tree Map contains key 3");
	        } else {
	            System.out.println("The Tree Map does not contains key 3");
	        }
	}

}
