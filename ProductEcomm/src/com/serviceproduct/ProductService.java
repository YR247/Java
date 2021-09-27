package com.serviceproduct;

import com.product.*;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//import com.hibernate.Employee;
//import com.productpackage.Product;
//import com.serviceemployee.HibernateUtil;

public class ProductService {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	//////////////// POST request//////////////////////////////////////////

	/* Method to CREATE an employee in the database business logic */
	public static Integer addProduct(int product_id, String product_name, int product_price) {

		Transaction tx = null;
		Integer productID = null;

		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			Product product = new Product(product_id, product_name, product_price);// created the object of Product class
			productID = (Integer) sessionObj.save(product); // save the object or insert the recording

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return productID;
	}

	//////////////// GET request//////////////////////////////////////////

	// list

	/* Method to CREATE an product in the database business logic */
	public void ListAllProduct() {
		System.out.println(" *************from inside  ListAllProduct()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// retrive logic
			List product = sessionObj.createQuery("From Product").list(); // select * from product: "product refer
																				// Product class
			Iterator iterator = product.iterator();
			while (iterator.hasNext()) {
				Product product1 = (Product) iterator.next();
				System.out.println("product id  " + product1.getProduct_id());
				System.out.println("product name  " + product1.getProduct_name());
				System.out.println("product price   " + product1.getProduct_price());
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
	public static void updateProductDetails(int product_id, int product_price) {
		System.out.println(" ***from inside  updateProductDetails()*** ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// update logic

			Product product = (Product) sessionObj.get(Product.class, product_id);

			product.setProduct_price(product_price);

			sessionObj.update(product);// hibernate will form update query automatically

			System.out.println(" product updated sucessfully...");

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
	public static void deleteProductDetailsById(int product_id, int product_price) {
		System.out.println(" ***from inside  deleteEmployeeDetailsById()***  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			//update logic

			Product product = (Product) sessionObj.get(Product.class, product_id);

			product.setProduct_price(product_price);

			sessionObj.delete(product);// hibernate will form delete query automatically

			System.out.println(" product deleted sucessfully..."+product.getProduct_id());

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