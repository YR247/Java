package com;

//using constructor

class Triangle {
	
	int perimeter(int side1,int side2, int side3) {
	int perimeter=side1+side2+side3;
	return perimeter;
	}
	
	double area(int s1, int s2, int s3) {
		int sp = (s1+s2+s3)/2;
		double areaofTriangle= (sp*(sp-s1)*(sp-s2)*(sp-s3));
		double a=Math.sqrt(areaofTriangle);
		return a;
	}
}

public class Triangle1{
	
	public static void main(String args[]) {
		
		Triangle t1= new Triangle();
		double temp1 = t1.area(3, 4, 5);
		System.out.println("Area of Triangle is: "+temp1);
		
		Triangle t2= new Triangle();
		double temp2 = t2.perimeter(3, 4, 5);
		System.out.println("Perimeter of Triangle is: "+temp2);
	}
		
	}
	


