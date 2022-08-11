package com.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
	
	@RequestMapping("/")
	public String Index() {
		return "Index";
	}
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello";
		
	}

}
