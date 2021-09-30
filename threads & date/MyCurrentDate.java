package com.threads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class CurrentDate implements Runnable {

	public void run() { // inbuilt method by thread class

		//try catch block
		try {
			for (int i = 1; i < 11; i++) {
				Thread.sleep(100);
				System.out.println(i);
				}
		} 
		catch (Exception e) {

			System.out.println("There is an exception: " + e);

		}
	}

	public void start() {
		System.out.println("Start ");
		
	}
}

public class MyCurrentDate  {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd ");
		LocalDateTime now = LocalDateTime.now();
		
		int threadNumber = 10;

		for (int i = 0; i < threadNumber; i++) {

			CurrentDate mcd = new CurrentDate();    //object created

			mcd.start();             //start calling
			System.out.println(dtf.format(now));       //print datetime 10 times
			

		}
	}
}
