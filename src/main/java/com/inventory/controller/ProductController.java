package com.inventory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.inventory.model.Product;
import com.inventory.model.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public ModelAndView getAllProducts() {		
		ModelAndView model=new ModelAndView("index");
		return model.addObject("products", productService.getAllProducts());
//		return productService.getAllProducts();
	}
	
	@GetMapping(value = "{id}")
	public Product getProduct(@PathVariable Integer id) 
	{
		return productService.getProduct(id);
	}
	@GetMapping("addProduct")
	public ModelAndView addProductForm() {
		Product product =new Product();
		ModelAndView model=new ModelAndView("addProduct");
		model.addObject("product", product);
		return model;
	}
	@RequestMapping(value ="addProduct" , method = RequestMethod.POST)
		
			public ModelAndView addProduct(@ModelAttribute("product") Product product) {
		
			productService.addProduct(product);
			
			return getAllProducts();
			
		
	}
	
	@PutMapping(value = "{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable Integer id) {
		productService.updateProduct(id,product);
		
	}
	
	@GetMapping(value = "deleteProduct/{id}")
	public ModelAndView deleteProduct(@PathVariable Integer id) {
		productService.deleteProduct(id);
		return getAllProducts();
	}
	
	
	@GetMapping(value="description/{id}")
	public ModelAndView showDescription(@PathVariable Integer id) {
		ModelAndView modelDescription=new ModelAndView("description");
		modelDescription.addObject("description", productService.getProduct(id));
		return modelDescription;
		}
	
	
}