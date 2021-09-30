package com;

public class Person {
	private String name;
	private String email;
	private String address;
	private Integer id;
	
	//constructor default
	public Person() {
		super();
	}
	
	//parameterized constructor
	public Person(Integer id, String name, String email, String address) {
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	

}






