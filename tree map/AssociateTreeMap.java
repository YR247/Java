package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class AssociateTreeMap {
	public static void main(String args[]){ 
		
		  // Creating an empty tree map
		  TreeMap<Integer,String> tm=new TreeMap<Integer,String>();   
		   
		  // Putting elements to the tree map 
		  tm.put(1, "Pink");
		  tm.put(2, "Lime");
		  tm.put(3, "Peach");
		  tm.put(4, "Crimson");
		    
		   for (Map.Entry<Integer,String> entry : tm.entrySet())
		   {
		    System.out.println(entry.getKey() + "-" + entry.getValue());
		   }
		 }  

}
