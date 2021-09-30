package com;

import java.util.Scanner;

class RectangleArea1{
	int returnArea(int length,int breadth) {
		return length*breadth;
	} 
}
public class Rectangle {
	@SuppressWarnings("resource")
	
	public static void main(String args[])	{
		
		Scanner sc=new Scanner(System.in);
		int length,breadth;
		System.out.print("Enter length of rectangle: ");
	    length=Integer.parseInt(sc.nextLine());
	    System.out.print("Enter breadth of rectangle: ");
	    breadth=Integer.parseInt(sc.nextLine());
	    
	    
	    RectangleArea1 rectangleArea=new RectangleArea1();
	    int temp=rectangleArea.returnArea(length, breadth);
	    System.out.println("Area of rectangle is: "+temp);
		
	}

}
