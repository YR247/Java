package com.collection;

import java.util.*;

class RevArrayList {
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
      
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();  //store elements
        for (int i = alist.size()-1;i>=0;i--) {
 
            revArrayList.add(alist.get(i));      //reverse elements
        }
        return revArrayList;
    }
 
    // Iterate through all the elements and print
    public void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
}
 
public class ReverseArrayList {
    @SuppressWarnings("removal")
	public static void main(String[] args)
    {
        RevArrayList obj = new RevArrayList();         //creating object for reverse
 
        ArrayList<Integer> arrayli = new ArrayList<Integer>();
 
        arrayli.add(new Integer(1));
        arrayli.add(new Integer(2));
        arrayli.add(new Integer(3));
        arrayli.add(new Integer(4));
        System.out.print("Original Array: ");            //original array
        obj.printElements(arrayli);
        
        arrayli = obj.reverseArrayList(arrayli);         //reversed array
        System.out.print("\nArray after reversing: ");      
        obj.printElements(arrayli);
    }
}