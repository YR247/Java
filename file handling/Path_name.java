package com.io;

import java.io.File;

public class Path_name {
	public static void main(String args[]) {
        
        File file = new File("D:/io/random.txt");
         if (file.isDirectory()) 
           {
            System.out.println(file.getAbsolutePath() + " is a directory.\n");
           } 
         else
          {
            System.out.println(file.getAbsolutePath() + " is not a directory.\n");
          }
         if (file.isFile()) 
           {
            System.out.println(file.getAbsolutePath() + " is a file.\n");
           } 
         else
          {
            System.out.println(file.getAbsolutePath() + " is not a file.\n");
          }  
      }

}
