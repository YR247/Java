package com.classesobjectdemo;

public class Triangle {
	
	int perimeter(){
		int s1 = 3;
		int s2 = 4;
		int s3 = 5;
		int perimeterOfTriangle = s1 + s2 + s3;
		return perimeterOfTriangle;
	}
		
		double area() {
			int side1 = 3;
			int side2 = 4;
			int side3 = 5;
			int sp=(side1+side2+side3)/2;
			int areaofTriangle= ((sp-side1)*(sp-side2)*(sp-side3));
			double a=Math.sqrt(areaofTriangle);
			return a;
		}

		public static void main(String args[]) {
			Triangle t1=new Triangle();
			Triangle t2=new Triangle();
			double temp1=t1.area();
			System.out.print("Area of triangle 1 is: " + temp1+"\n");
			int temp2=t2.perimeter();
			System.out.println("Perimeter of triangle is: " + temp2 + "\n");
		}
}
		
	
	
	
	
