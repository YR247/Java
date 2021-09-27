package com.MappingAll;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Store {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		
		// setting values of customer
		Customer e1 = new Customer();
		e1.setFirstname("Himanshi");
		e1.setLastname("Bhoria");
		e1.setEnable("Yes");
		e1.setCustomerPhone(1234567890);

		// setting some values of employee ravi
		ShippingAddress add1 = new ShippingAddress();
		add1.setAddress("Gurgaon M.K");
		add1.setCity("Guragon");
		add1.setState("Haryana");
		add1.setCountry("India");
		add1.setZipcode(122102);
		
		//setting values of Billing address
		BillingAddress add2 = new BillingAddress();
		add2.setAddress("Gurgaon V.K");
		add2.setCity("Gurgaon");
		add2.setState("Haryana-1");
		add2.setCountry("India");
		add2.setZipcode(122103);
		
		//Adding cart Details
		Cart add3 = new Cart();
		add3.setTotalPrice(1234);
		
		//Adding User Details
		User add4 = new User();
		add4.setEmailid("himanshi10@gmail.com");
		add4.setPassword("Himanshi13@");
		add4.setEnable("Yes");
		
		//Adding CartItem
		CartItem add5 = new CartItem();
		add5.setPrice(1234);
		add5.setQuantity(3);
		
		//Adding Product
		Product add6 = new Product();
		add6.setName("Bag");
		add6.setCategory("Stationary");
		add6.setManufacturer("Dell");
		add6.setDescription("A bag from Dell");
		add6.setPrice(12345);
		add6.setUnit(4);
		
		//Adding Authorities
		Authorities add7 = new Authorities();
		add7.setEmailId("dell@gmail.com");
		add7.setAuthorities("this is from dell");
		
		// settinggg
		e1.getShippingAddress(add1);
		e1.getBillingAddress(add2);
		e1.getCart(add3);
		e1.getUser(add4);
		e1.getCartItem(add5);
		e1.getProduct(add6);
		
		
		
		// insert into db
		session.persist(e1);
		t.commit();

		session.close();
		System.out.println("success....");
	}
}