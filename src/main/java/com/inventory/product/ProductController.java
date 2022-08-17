package com.inventory.product;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public ModelAndView getAllTopics() {		
		ModelAndView model=new ModelAndView("index");
		return model.addObject("products", productService.getAllProducts());
//		return productService.getAllProducts();
	}
	
	@RequestMapping(value = "{id}")
	public Product getProduct(@PathVariable Integer id) 
	{
		return productService.getProduct(id);
	}
	
	@PostMapping
	public void addProduct(@RequestBody Product product) {
		
		productService.addProduct(product);
		
	}
	@PutMapping(value = "{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable Integer id) {
		productService.updateProduct(id,product);
		
	}
	
	@GetMapping(value = "deleteProduct/{id}")
	public String deleteProduct(@PathVariable Integer id) {
		productService.deleteProduct(id);
		return "Product Deleted Successfully";
	}
}