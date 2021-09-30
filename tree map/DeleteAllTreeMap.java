package com.collection;

import java.util.TreeMap;

public class DeleteAllTreeMap {
	public static void main(String args[]){ 
		
		  // Creating an empty tree map
		  TreeMap<String,String> tm=new TreeMap<String,String>();   
		   
		  // Putting elements to the tree map 
		  tm.put("1", "Pink");
		  tm.put("2", "Lime");
		  tm.put("3", "Peach");
		  tm.put("4", "Crimson");
		  System.out.println("Original TreeMap: "+tm);
		  
		  tm.clear();            //delete everything in tree map
		  System.out.println("Final TreeMap: "+tm);
		 } 
	


}
