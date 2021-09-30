package com.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapWay3 {
	public static void main(String[] args) {
		
       
        Map<String, Integer> mapdemp = new LinkedHashMap<String, Integer>();
 
        mapdemp.put("A", 11);        //putting key,value  -string,int
        mapdemp.put("B", 22);
        mapdemp.put("C", 33);
        mapdemp.put("D", 44);
 
        // converting into key and take the key from give list
        Iterator<String> itr = mapdemp.keySet().iterator();
 
        while (itr.hasNext()) {
 
            String keydemo = itr.next();
 
            Integer valuedemo = mapdemp.get(keydemo);
 
            System.out.println("key:" + keydemo + " values:" + valuedemo);
        }

	}


}
