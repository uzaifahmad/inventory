package com.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Product {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String productName;
	private float price;
	private String description;
	
	public Product(Integer id, String productName, float price, String description) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.description = description;
	}
	public Product() 
	{
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
    @Column(name = "productName")
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
    @Column(name = "price")
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}