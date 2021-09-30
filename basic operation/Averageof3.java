package com;

import java.util.*;

class Average{
	int average;
	void calculate(int num1,int num2,int num3) {
		average=(num1+num2+num3)/3;		
	}
	int printAverage() {
		return average;
	}
}
public class Averageof3 {
	@SuppressWarnings("resource")
	
	public static void main(String args[])	{
	
		Scanner sc =new Scanner(System.in);               //user gives value
		int num1,num2,num3;
		System.out.print("Enter first number: ");
		num1=Integer.parseInt(sc.nextLine());
		System.out.print("Enter second number: ");
		num2=Integer.parseInt(sc.nextLine());
		System.out.print("Enter third number: ");
		num3=Integer.parseInt(sc.nextLine());
		
		
		Average average=new Average();	
		average.calculate(num1, num2, num3);
		int temp=average.printAverage();
		System.out.println(temp);		
	}
}
