package com.spring;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String a[]) {

		String confFile = "beans.xml";

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);

		EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDAO");

		Employee emp = empDao.findEmployeeById(2);

		String LastName = emp.getLastName();

		String salary = emp.getSalary();

		String FirstName = emp.getFirstName();

		System.out.println();

		// Employee emp = empDao.findEmployeeById(1);// get emp by his id

		System.out.println(
				"Last name: " + LastName + "\nsalary: " + salary + "\nFirst name of emplpoyee: " + FirstName);

		System.out.println("-----------------------------------------------");

	}

}