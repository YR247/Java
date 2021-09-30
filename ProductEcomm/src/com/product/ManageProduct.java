package com.product;

import java.util.ArrayList;
import com.serviceproduct.*;
import java.util.List;

//import serviceproduct.ProductService;

public class ManageProduct {
	public static void main(String args[]) {
		ProductService productservice = new ProductService();
		
		/* Add few product records in database */
		Integer proID1 = ProductService.addProduct(1,"Lamp",200);// asssinged values from here
		Integer proID2 = ProductService.addProduct(2,"Painting",500);// asssinged values from here
	
		List<Integer> proinfo = new ArrayList<Integer>();
		
		proinfo.add(proID1);
		proinfo.add(proID2);
		
		if (proinfo.size() != 0) {
			System.out.println("*************Inserted**********");
		} else {
			System.out.println("############## not Inserted #############");

		}

		/* list employee records in database */
		try {
			productservice.ListAllProduct();
		} catch (Exception e) {

			e.printStackTrace();
		}

		/* update employee records in database */
		try {
		ProductService.updateProductDetails(2, 544);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		/* delete employee records in database by id */
		try {
		ProductService.deleteProductDetailsById(1, 555);
		} catch (Exception e) {

			e.printStackTrace();
		}
	
		
	}
	

}
