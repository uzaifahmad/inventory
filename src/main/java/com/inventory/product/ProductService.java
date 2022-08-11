package com.inventory.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ProductService {
	
	List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"Mobile",5000,"This is Mobile"),
				new Product(2,"Laptop",10000,"This is Laptop"),
				new Product(3,"Bag",1000,"This is Bag")
				));
	
	public List<Product> getAllProducts() {
		return products;
		
	}
	
	public Product getProduct(int id) {
		
		return products.stream().filter(p -> p.getId()==(id)).findFirst().get();
		
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void updateProduct(int id, Product product) {
		
		for(int i =0; i<products.size();i++) {
			Product p= products.get(i);
			if (p.getId()==id) {
				products.set(i, product);
				return;
			}
			
		}
		
		
	}

	public void deleteProduct(int id) {
		products.removeIf(p->p.getId()==id);
		
	}
			

}
