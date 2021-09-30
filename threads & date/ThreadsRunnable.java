package com.threads;


//creation of threads using runnable 

class ThreadsRun implements Runnable {

	public void run() { // inbiult method by thread class

		//try catch block
		try {
			for (int i = 1; i < 5; i++) {
				Thread.sleep(5000);
				System.out.println(i);
				}
		} 
		catch (Exception e) {

			System.out.println("There is an exception: " + e);

		}

	}

}

public class ThreadsRunnable {

	public static void main(String[] args) {
		
		int threadNumber = 2;

		for (int i = 0; i < threadNumber; i++) {

			ThreadsDemos threadsDemos = new ThreadsDemos();    //object created

			threadsDemos.start();             //start calling
			threadsDemos.setName("yashika");
			threadsDemos.setPriority(1);
			

		}
		

	}

}
