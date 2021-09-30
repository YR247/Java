package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadPlainText {
	public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "D:/io/random.txt";
             FileWriter fw = new FileWriter(filename,false); 
             //appends the string to the file
             fw.write("Hello\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("D:/io/random.txt"));
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();                          
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }

}
