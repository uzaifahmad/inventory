package com.inventory.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"Mobile",5000,"This is Mobile"),
				new Product(2,"Laptop",10000,"This is Laptop"),
				new Product(3,"Bag",1000,"This is Bag")
				));
	
	public List<Product> getAllProducts() {
		
		return (List<Product>) productRepository.findAll();
		
	}
	
	public Product getProduct(int id) {
		
		
		
	}
 
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void updateProduct(int id, Product product) {
		
		productRepository.save(product);
			}
			

	public void deleteProduct(int id) {
		products.removeIf(p->p.getId()==id);
		
	}
			

}
