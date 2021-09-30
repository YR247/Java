package com.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapWay2 {

	public static void main(String[] args) {
		
        Map<String, String> mapdemp = new LinkedHashMap<String, String>();
       
        mapdemp.put("1", "A");      //putting key,values  - string both
        mapdemp.put("2", "B");
        mapdemp.put("3", "C");
        mapdemp.put("4", "D");
 
     // converting into key and take the key from give list
        Iterator<String> itr = mapdemp.keySet().iterator();
 
        while (itr.hasNext()) {
 
            String keydemo = itr.next();
 
            String valuedemo = mapdemp.get(keydemo);      //getting key
 
            System.out.println("key:" + keydemo + " values:" + valuedemo);
        }

	}

}
