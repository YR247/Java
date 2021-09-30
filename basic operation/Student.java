package com;

public class Student {
	
	
	String getName(String name) {
		return name;
	}
	
	int getRollno(int roll_no) {
		return roll_no;
	}
	
	
	public static void main(String args[]) {
		Student student = new Student();
		
		String name =student.getName("John");
		System.out.print("Student's name is: "+name+"\n");
		
		int roll_no = student.getRollno(2);
		System.out.print("Roll no of student is: "+roll_no);
		
	}

}
