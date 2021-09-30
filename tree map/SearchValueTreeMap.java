package com.collection;
import java.util.TreeMap;

public class SearchValueTreeMap {
	public static void main(String args[]){ 
		
		  // Creating an empty tree map
		  TreeMap<Integer,String> tm=new TreeMap<Integer,String>();   
		   
		  // Putting elements to the tree map 
		  tm.put(1, "Pink");
		  tm.put(2, "Lime");
		  tm.put(3, "Peach");
		  tm.put(4, "Crimson");
		  
		  if(tm.containsValue("Lime")){
	            System.out.println("The TreeMap contains value: Lime");
	        } else {
	            System.out.println("The TreeMap does not contain value: Lime");
	        }
		 } 

}
