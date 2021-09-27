package com.customer;

public class Customer {
	private int customer_id;
	private String customer_username;
	private String customer_password;
	
	public Customer() {
		
	}
	
	public Customer(int customer_id, String customer_username, String customer_password) {
		super();
		
		this.customer_id=customer_id;
		this.customer_username=customer_username;
		this.customer_password=customer_password;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_username() {
		return customer_username;
	}

	public void setCustomer_username(String customer_username) {
		this.customer_username = customer_username;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	

}

