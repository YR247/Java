package com.threads;

class MyCurrentDate{
	public void main(String s) {
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

// first class
class class1 implements Runnable{
	private MyCurrentDate mcd;
	String s = "class 1 ";
	class1(MyCurrentDate mcd){
		this.mcd = mcd;
	}
	public void run() {
		mcd.main(s);
	}
	public void start() {
		System.out.println("class 1 thread ");
		
	}
}

// second class
class class2 implements Runnable{
	private MyCurrentDate mcd;
	String s = "class 1 ";
	class2(MyCurrentDate mcd){
		this.mcd = mcd;
	}
	public void run() {
		mcd.main(s);
	}
	public void start() {
		System.out.println("class 2 thread ");
		
	}
}

// third class
class class3 implements Runnable{
	private MyCurrentDate mcd;
	String s = "class 1 ";
	class3(MyCurrentDate mcd){
		this.mcd = mcd;
	}
	public void run() {
		mcd.main(s);
	}
	public void start() {
		System.out.println("class 3 thread ");
		
	}
}

public class MyMain {
	public static void main(String args[]) {
		MyCurrentDate obj1 = new MyCurrentDate();   //first object created
		class1 c1 = new class1(obj1);
			c1.start();             //start calling
			
			MyCurrentDate obj2 = new MyCurrentDate();   //second object created
			class2 c2 = new class2(obj2);
				c2.start();
				
				MyCurrentDate obj3 = new MyCurrentDate();   //third object created
				class3 c3 = new class3(obj3);
					c3.start();
	}

}
