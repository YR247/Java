package com.io;

import java.io.File;

public class Pathname {
	public static void main(String[] args) {
        // Create a File object
        File file = new File("D:/io/random.txt");
         if (file.exists()) 
           {
            System.out.println("This file exists.\n");
           } 
         else
          {
            System.out.println("This file does not exist.\n");
          }
       }

}
