package com.collection;

import java.util.TreeMap;

public class CopyToAnotherTreeMap {
	public static void main(String args[]){  
		  
		  // Creating an empty tree map 1
		  TreeMap<String,String> tm1=new TreeMap<String,String>();   
		  //
		  tm1.put("TM1", "Crimson");
		  tm1.put("TM2", "Lime");
		  tm1.put("TM3", "White");
		  tm1.put("TM4", "Cyan");
		  System.out.println("Tree Map 1: "+tm1);
		   
		// Creating an empty tree map 2
		  TreeMap<String,String> tm2 = new TreeMap<String,String>();
		  tm2.put("TMa", "Peach");
	      tm2.put("TMb", "Pink");
          System.out.println("Tree Map 2: "+tm2);
		  tm1.putAll(tm2);
		  System.out.println("After coping map2 into map1: "+tm1);   
		 }  

}
