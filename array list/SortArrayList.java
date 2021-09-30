package com.collection;

import java.util.*;

public class SortArrayList {
    public static void main(String args[])
    {
  
        // Get the ArrayList
        ArrayList<String> list = new ArrayList<String>();
  
        // Populate the ArrayList
        list.add("b");
        list.add("a");
        list.add("e");
        list.add("f");
        list.add("c");
  
        // unsorted ArrayList
        System.out.println("Unsorted ArrayList: "+ list);
  
        // Sorting ArrayList in ascending Order using Collection.sort() method
        Collections.sort(list);
  
        // sorted ArrayList
        System.out.println("Sorted ArrayList "+ "in Ascending order : "+ list);
    }
}