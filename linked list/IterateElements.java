package com.collection;
import java.util.LinkedList;
import java.util.Iterator;

public class IterateElements {
  public static void main(String[] args) {
    // creating an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
     
   // use adding values in linked list
          l_list.add("Cyan");
          l_list.add("Blue");
          l_list.add("Black");
          l_list.add("White");
          l_list.add("Pink");
// set Iterator at specified index
   Iterator p = l_list.listIterator(2);       //iterate values after index 2

   // print list from third position
   while (p.hasNext()) {
   System.out.println(p.next());
   
   Iterator q = l_list.listIterator();        //iterate all values
   while (q.hasNext()) {
	   System.out.println(q.next());
   }
   }
}
}