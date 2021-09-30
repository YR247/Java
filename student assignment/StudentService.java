package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentService {
	
	static HashMap<Integer, Student> studentIdMap = getStudentIdMap(); //map list



	public StudentService() {
	super();



	if (studentIdMap == null) {
	studentIdMap = new HashMap<Integer, Student>();
	// Creating some objects of Person while initializing
	Student indiaPerson = new Student(1, "yashika", "yashika@gmail.com", "gurugram");
	Student chinaPerson = new Student(2, "john2", "john2@gmail.com", "delhi");
	Student nepalPerson = new Student(3, "john3", "john3@gmail.com", "delhi");
	Student bhutanPerson = new Student(4, "john4", "john4@gmail.com", "delhi");



	//adding map list of collections in java
	studentIdMap.put(1, indiaPerson);
	studentIdMap.put(4, chinaPerson);
	studentIdMap.put(3, nepalPerson);
	studentIdMap.put(2, bhutanPerson);
	}
	}



	public List<Student> getAllStudentlist() {
	List<Student> studentlist = new ArrayList<Student>(studentIdMap.values());
	return studentlist;
	}



	public Student getStudent(int id) {
	Student Student = studentIdMap.get(id);
	return Student;
	}
	// add student
	public Student addStudent(Student student) {
	student.setId(getMaxId()+ 1);

	// key , value
	studentIdMap.put(student.getId(), student); ///logic class
	return student;
	}
	//update
	public Student updateStudent(Student student) {
	if (student.getId() <= 0)
	return null;
	studentIdMap.put(student.getId(), student);
	return student;



	}
	//delete

//
//
//	public void deleteStudent(int id) {
//	Student student = studentIdMap.delete(id,student);
//	return Student;
//	}
	//delete
	public void deleteStudent(int id) {
	studentIdMap.remove(id);
	}
	public static HashMap<Integer, Student> getStudentIdMap() {
	return studentIdMap;
	}


	// Utility method to get max id
	public static int getMaxId() {
	int max = 0;
	for (int id : studentIdMap.keySet()) {
	if (max <= id)
	max = id;



	}
	return max;
	}


	

}
