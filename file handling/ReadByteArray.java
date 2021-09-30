package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadByteArray {
	public static void main(String args[]){       
        String file = "D:/io/random.txt";
        InputStream i = null;
        try {
            i = new FileInputStream(file);
            byte filecontent[] = new byte[2*1024];
            int count = 0;
            while((count = i.read(filecontent)) > 0){
                System.out.println(new String(filecontent, 0, count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(i != null) i.close();
            } catch(Exception e){
                 
            }
        }
    }

}
