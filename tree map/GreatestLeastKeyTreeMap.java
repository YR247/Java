package com.collection;

import java.util.*;

public class GreatestLeastKeyTreeMap {  
     public static void main(String args[]) {

    	 // Create a tree map
    	 TreeMap <String,String> tm = new TreeMap <String,String> ();

    	 // Put elements to the map 
    	 tm.put("TM1", "Crimson");
    	 tm.put("TM2", "Lime");
    	 tm.put("TM3", "Cyan");
    	 tm.put("TM4", "Peach");

    	 System.out.println("Orginal Tree Map: " + tm);
    	 System.out.println("Greatest key: " + tm.firstEntry());
    	 System.out.println("Least key: " + tm.lastEntry());
     }
}