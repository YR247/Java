package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	public static void main(String a[]){
        StringBuilder stringbuilder = new StringBuilder();
        String sLine = "";
        String sdata = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("D:/io/random.txt"));
             while (sLine != null)
             {
                if (sLine == null)
                  break;
                sdata += sLine;
                sLine = br.readLine();
                
            }
              System.out.println(sdata);
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }

}
