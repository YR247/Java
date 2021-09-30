package com;



class Shapes {
	

class Circle extends Shapes {
	void area(double r) {
		double CircleArea = 3.14*(r*r);
		System.out.println("Area of Circle: "+ CircleArea);         //circle  area
	}		
}

class Sphere extends Shapes{
	void area(double r) {
		double SphereArea = 4*3.14*(r*r);
		System.out.println("Area of Sphere: "+ SphereArea);         //sphere area
	}
	void volume(double r) {
		double SphereVolume = (4/3)*3.14*(r*r*r);
		System.out.println("Volume of Sphere: " + SphereVolume);    //sphere  volume
	}
}


class triangle extends Shapes {
	void area(double base,double height) {
		double triangleArea = (base*height)/2;
		System.out.println("Area of Triangle: " + triangleArea);      //triangle area
	}
}
class Cone extends Shapes {
	void area(double radius,double slantHeight) {
		double ConeArea = 3.14*radius*slantHeight;
		System.out.println("Area of Cone: " + ConeArea);              //cone area
	}
	void volume(double radius,double height) {
		double ConeVolume= 3.14*radius*radius*(height/3);
		System.out.println("Volume of Cone: "+ ConeVolume);            //cone volume
	}
}

class Square extends Shapes {
	void area(double side) {
		double SquareArea = side*side;
		System.out.println("Area of Square: "+ SquareArea);         //square area
	}
}
class Cube extends Shapes {
	void area(double side) {
		double CubeArea = 6*(side*side);
		System.out.println("Area of Cube: "+ CubeArea);         //cube area
	}
	void volume(double side) {
		double CubeVolume = side*side*side;
		System.out.println("Volume of Cube: "+ CubeVolume);          //cube volume
	}
}

public static void main(String args[]){
	
	Square sq = new Shapes().new Square();                //square
	sq.area(2.14);
	
	Cube cube = new Shapes().new Cube();                  //cube
	cube.area(2.16);
	cube.volume(2.16);
	
	Circle cir = new Shapes().new Circle();            //circle
	cir.area(2);
	
	Sphere sphere = new Shapes().new Sphere();            //sphere
	sphere.area(9.2);
	sphere.volume(9.2);
	
	triangle tri = new Shapes().new triangle();         //triangle
	tri.area(2,6);
	
	Cone cone = new Shapes().new Cone();               //cone
	cone.area(2.5, 3.6);
	cone.volume(2.5, 3.6);
	
	
}
}


