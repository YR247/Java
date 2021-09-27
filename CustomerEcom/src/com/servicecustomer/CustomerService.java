package com.servicecustomer;

import com.customer.*;

import java.util.Iterator;
import java.util.List;
import com.customer.Customer;
import com.servicecustomer.HibernateUtil;

public class CustomerService {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	//////////////// POST request//////////////////////////////////////////

	/* Method to CREATE an employee in the database business logic */
	public static Integer addProduct(int customer_id, String customer_username, String customer_password) {

		Transaction tx = null;
		Integer customerID = null;

		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			Customer customer = new Customer(customer_id, customer_username, customer_password);// created the object of Product class
			customerID = (Integer) sessionObj.save(customer); // save the object or insert the recording

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return customerID;
	}

	//////////////// GET request//////////////////////////////////////////

	// list

	/* Method to CREATE an customer in the database business logic */
	public void ListAllCustomer() {
		System.out.println(" *************from inside  ListAllCustomer()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// retrive logic
			List product = sessionObj.createQuery("From Customer").list(); // select * from customer: "product refer
																				// Customer class
			Iterator iterator = product.iterator();
			while (iterator.hasNext()) {
				Customer customer1 = (Customer) iterator.next();
				System.out.println("Customer id  " + customer1.getCustomer_id());
				System.out.println("Customer username  " + customer1.getCustomer_username());
				System.out.println("Customer password   " + customer1.getCustomer_password());
			}

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}

// update

////////////////PUT request   id//////////////////////////////////////////

	/* Method to update a product in the database business logic */
	public static void updateCustomerDetails(int customer_id, String customer_password) {
		System.out.println(" ***from inside  updateCustomerDetails()*** ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// update logic

			Customer customer = (Customer) sessionObj.get(Customer.class, customer_id);

			customer.setCustomer_password(customer_password);

			sessionObj.update(customer);// hibernate will form update query automatically

			System.out.println(" customer updated sucessfully...");

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

// delete

////////////////DELETE request   id//////////////////////////////////////////

	/* Method to delete a product in the database business logic */
	public static void deleteCustomerDetailsById(int customer_id, String customer_password) {
		System.out.println(" ***from inside  deleteCustomerDetailsById()***  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			//update logic

			Customer customer = (Customer) sessionObj.get(Customer.class, customer_id);

			customer.setCustomer_password(customer_password);

			sessionObj.delete(customer);// hibernate will form delete query automatically

			System.out.println(" customer deleted sucessfully..."+customer.getCustomer_id());

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

	

}