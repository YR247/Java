package com;

import java.util.Scanner;
class Area {
	int length,breadth;
	
	//set dim
	void setDim(int l,int b)	{
		length=l;
		breadth=b;
	}
	
	//area of rectangle
	int getArea() {
		return length*breadth;
	} 
	
}
public class RectangleUserValue {
   public static void main(String args[])
   {
	   @SuppressWarnings("resource")
	   
	   //user gives value 
	Scanner sc = new Scanner(System.in);
	   int length,breadth;
	   
	   System.out.print("Enter length of rectangle: ");
	   length=Integer.parseInt(sc.nextLine());
	   System.out.print("Enter breadth of rectangle: ");
	   breadth=Integer.parseInt(sc.nextLine());
	   
	   Area area=new Area();
	   area.setDim(length, breadth);
	   int temp1=area.getArea();
	   System.out.println("Area of rectangle is: "+temp1);
	   
	   
   }
}
