package com.example.demo.controller;

import java.util.List;       

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.entity.Employee;
import com.example.demo.entity.Product;
//import com.example.demo.service.EmployeeServiceImpl;
import com.example.demo.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController 
{
private ProductServiceImpl pserimpl;

@Autowired
public ProductController(ProductServiceImpl pserimpl) {
	this.pserimpl = pserimpl;
}

@GetMapping("/list") 
//localhost:8080/employees/list
@CrossOrigin(origins="http://localhost:4200")
public List<Product> displayDetails()
{
	return pserimpl.fetchAll();
}
@GetMapping("/list/{productId}")
public Product getById(@PathVariable int productId) throws Exception
{
	Product product=pserimpl.fetchById(productId);
	if(product==null)
		throw new Exception("Product id is not found : "+productId);
 return product;
}
@PostMapping("/add")
@CrossOrigin(origins="http://localhost:4200")
public Product insertion(@RequestBody Product product)
{
	pserimpl.insertOrUpdate(product);
	return product;
}
@PutMapping("/list")
@CrossOrigin(origins="http://localhost:4200")
public Product updation(@RequestBody Product product)
{
	pserimpl.insertOrUpdate(product);	
	return product;
}
@CrossOrigin(origins="http://localhost:4200")
@DeleteMapping("/delete/{productId}")
public void deletion(@PathVariable int productId) throws Exception
{
	Product product=pserimpl.fetchById(productId);
	if(product==null)
		throw new Exception ("Id is not Found"+ productId);
pserimpl.delete(productId);
}
@CrossOrigin(origins="http://localhost:4200")
@GetMapping("/search")
public ResponseEntity<List<Product>> search(@RequestParam("query") String query){
	return ResponseEntity.ok(pserimpl.searchBy(query));
}
}

