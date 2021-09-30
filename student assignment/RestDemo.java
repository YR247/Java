package com;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestDemo {
	PersonService personService = new PersonService();
	StudentService studentService = new StudentService();

	 

	 // Get call using spring based web service

	 

	 @GetMapping("/myurl")
	public String sayHello() {

		 System.out.println("Hey, its Yashika ");

	 return "hi, how are you?";    


	}
	
//	@GetMapping("/personinfo")
//	public Person getDummyPerson() {
//
//	Person p =new Person();//creating java object
//
//	p.setName("Ram");
//	p.setEmail("Ram@gmail.com");
//	p.setAddress("delhi");
//
//	return p;
//
//
//
//	}
//	
//	@GetMapping("/personinfoid/{id}")
//	public Person getDummyPersonId(@PathVariable("id") Integer id) {
//
//	Person p =new Person();//creating java object
//
//	p.setName("Ram");
//	p.setEmail("Ram@gmail.com");
//	p.setAddress("delhi");
//	p.setId(id);
//
//	return p;
//	}
	
	//student--------------ASSIGNMENT-------------------------------------------
	
	@GetMapping("/studentinfo")
	public Student getDummyStudent() {

	Student s =new Student();//creating java object

	s.setName("Yashika");
	s.setEmail("yashika.rohilla@espire.com");
	s.setAddress("gurugram");

	return s;
	}
	
	//------------------------------
	@GetMapping("/studentinfoid/{id}")
	public Student getDummyStudentId(@PathVariable("id") Integer id) {

	Student s =new Student();//creating java object

	s.setName("Yashika");
	s.setEmail("yashika.rohilla@espire.com");
	s.setAddress("gurugram");
	s.setId(id);

	return s;
	}
	

	 // add the student information POst

	 @PostMapping(value = "/insertstudentdetails")
	public Student insertDummyStudent(@RequestBody Student student) {
	return studentService.addStudent(student); //calling the service
	}

	 

	//update student info
	@PutMapping("/update")
	public Student updatestudentInfo(@RequestBody Student student) {
	return studentService.updateStudent(student);

	 

	 }
	//get list
	@GetMapping("/getlist")
	public List<Student> getDummyStudentList() {
	List<Student> listOfStudent = studentService.getAllStudentlist();
	return listOfStudent;
	}
	
	//delete info
//	@DeleteMapping("/delete/109")
//	public List<Student> deleteDummyStudent(@PathVariable Integer id){
//		new StudentService().remove(id);
//		return new StudentService().getAllStudentlist();
//	}
//	
	
	
	@DeleteMapping("/delete/{id}")
	public List<Student> deleteStudentById(@PathVariable Integer id) {
	new StudentService().deleteStudent(id);
	return new StudentService().getAllStudentlist();
	}
	
	
	
//---------------------post & put-----------------------
	


//	 // add the person information POst

	 

//	 @PostMapping(value = "/insertpersondetails")
//	public Person insertDummyPerson(@RequestBody Person person) {
//	return personService.addPerson(person); //calling the service
//	}

	 

//	//update person info
//	@PutMapping("/update")
//	public Person updatepersonInfo(@RequestBody Person person) {
//	return personService.updatePerson(person);

	 

//	 }
//	//get list
//	@GetMapping("/getlist")
//	public List<Person> getDummyPersonList() {
//	List<Person> listOfPerson = personService.getAllPersonlist();
//	return listOfPerson;
//	}

	 

}






	

