package com;


	
	class Student1{
	
	String name;
	int roll_no;
	long phone_no;
	String address;
	void studentdetail(String n,int roll,long phone,String add) {
		name=n;
		roll_no=roll;
		phone_no=phone;
		address=add;
		
		System.out.println(name +" "+roll_no+" "+phone_no+" "+address+"\n");
		}
	}
	
	
public class Student2{
	public static void main(String args[]) {
		Student1 obj1 = new Student1();
		Student1 obj2 = new Student1();
		
		obj1.studentdetail("John", 1, 998877665, "Delhi");
		obj2.studentdetail("Sam", 2, 223344551, "Gurugram");
		
	}

}
