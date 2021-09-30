package com.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMaps {

	public static void main(String[] args) {
		 Map<Integer, String> mapdemp = new LinkedHashMap<Integer, String>();
	 
	        mapdemp.put(1, "A");           //putting key,values  -int,string
	        mapdemp.put(2, "B");
	        mapdemp.put(3, "C");
	        mapdemp.put(4, "D");
	 
	     // converting into key and take the key from give list
	        Iterator<Integer> itr = mapdemp.keySet().iterator();
	 
	        while (itr.hasNext()) {
	 
	            Integer keydemo = itr.next();
	 
	            String valuedemo = mapdemp.get(keydemo);         //getting key
	 
	            System.out.println("key:" + keydemo + " values:" + valuedemo);
	        }
	 

	}

}
