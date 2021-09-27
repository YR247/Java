package com.customer;


import java.util.ArrayList;
import java.util.List;

import com.servicecustomer.CustomerService;



//import serviceproduct.ProductService;

public class ManageCustomer {
	public static void main(String args[]) {
		CustomerService productservice = new CustomerService();
		
		/* Add few product records in database */
		Integer proID1 = CustomerService.addCustomer(1,"Shyam","qw#qw");// asssinged values from here
		Integer proID2 = CustomerService.addCustomer(2,"Ram","ww!ww");// asssinged values from here
	
		List<Integer> cusinfo = new ArrayList<Integer>();
		
		cusinfo.add(proID1);
		cusinfo.add(proID2);
		
		if (cusinfo.size() != 0) {
			System.out.println("*************Inserted**********");
		} else {
			System.out.println("############## not Inserted #############");

		}

		/* list employee records in database */
		try {
			productservice.ListAllCustomer();
		} catch (Exception e) {

			e.printStackTrace();
		}

		/* update employee records in database */
		try {
		CustomerService.updateCustomerDetails(2, "qwerty");
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		/* delete employee records in database by id */
		try {
		CustomerService.deleteCustomerDetailsById(1,"abc#AB");
		} catch (Exception e) {

			e.printStackTrace();
		}
	
		
	}
	

}

