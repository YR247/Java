package com.demo.serviceimplementation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jparepositories.ProductRepository;
import com.demo.model.Product;
import com.demo.service.ProductService;

@Service
public class ProductServiceImplementation implements ProductService{
	//dependency injection  busines logic class
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProductDetails(Product product) {
				
		Product productdetails = productRepository.save(product);
		
		return productdetails;
	}

	@Override
	public ArrayList<Product> ListOfProducts(Product product) {
		ArrayList<Product> list = (ArrayList<Product>) productRepository.findAll();
		return list;
	}

	@Override
	public void deleteProductById(long id) {
		productRepository.deleteById(id);
	}

	@Override
	public void viewProductById(long id) {
		productRepository.findById(id);
	}

	@Override
	public void updateOfProductById(long id) {
//		Product product2 = productRepository.findById(id);
//		product2.setCategory(data.getCategory());
//		product2.setDescription(data.getDescription());
//		product2.setManufacturer(data.getManufacturer());
//		product2.setName(data.getName());
//		product2.setUnit(data.getUnit());
//		
//		Product prod = productRepository.save(product2);
	} 

}