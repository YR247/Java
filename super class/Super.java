package com;

public class Super {
	String color = "White";
}
class Cat extends Super{
	String color = "Orange";
	void CatColor() {
		System.out.println(color);
		System.out.println(super.color);         //print color of cat
	}
}
class Super1{
	public static void main(String args[]) {
		Cat cat= new Cat();
		cat.CatColor();
	}
}