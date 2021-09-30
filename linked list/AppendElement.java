package com.collection;
import java.util.LinkedList;

public class AppendElement {
public static void main(String[] args) {
   // creating an empty linked list
   LinkedList<String> l_list = new LinkedList<String>();
   System.out.println("Empty List: " + l_list);
   
    //adding elements in empty linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");
	
 // print the list
 System.out.println("Appended list: " + l_list);
 }
}