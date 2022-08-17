package com.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inventory.product.ProductService;

@Controller
public class InventoryController 
{
	
	@Autowired
	private ProductService productService;

	
	@GetMapping("/")
	public String Index(Model model) 
	{
			model.addAttribute("product",productService.getAllProducts());
			return "index";
		
	
	}

}
