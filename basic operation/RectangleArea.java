package com;

class Rect{
	//Area of rectangle
	int area(int length,int breadth) {
		return length*breadth;
	}
	
}
public class RectangleArea {
	
	
	public static void main(String args[]) {
		// for side(4,5)
		Rect rect1=new Rect();
		int temp1=rect1.area(4,5);
		System.out.println("Area of rectangle with side 4 & 5 is: "+temp1);
		
		
		//For side(5,8)
		Rect rect2=new Rect();
		int temp2=rect2.area(5,8);
		System.out.println("Area of rectangle with side 5 & 8 is: "+temp2);
		
	}

}