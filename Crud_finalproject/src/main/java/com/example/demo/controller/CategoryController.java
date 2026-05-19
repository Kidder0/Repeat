package com.example.demo.controller;

import java.util.List;       

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
//import com.example.demo.entity.Employee;
import com.example.demo.service.CategoryServiceImpl;

@RestController
@RequestMapping("/category")
public class CategoryController 
{
private CategoryServiceImpl cgserimpl;

@Autowired
public CategoryController(CategoryServiceImpl cgserimpl) {
	this.cgserimpl = cgserimpl;
}

@GetMapping("/list") 
//localhost:8080/employees/list
@CrossOrigin(origins="http://localhost:4200")
public List<Category> displayDetails()
{
	return cgserimpl.fetchAll();
}
@GetMapping("/list/{categoryId}")
@CrossOrigin(origins="http://localhost:4200")
public Category getById(@PathVariable int categoryId) throws Exception
{
	Category category=cgserimpl.fetchById(categoryId);
	if(category==null)
		throw new Exception("Category id is not found : "+categoryId);
 return category;
}
@PostMapping("/add")
@CrossOrigin(origins="http://localhost:4200")
public Category insertion(@RequestBody Category category)
{
	category.setpCId(0);
	cgserimpl.insertOrUpdate(category);
	return category;
}
@PutMapping("/list")
@CrossOrigin(origins="http://localhost:4200")
public Category updation(@RequestBody Category category)
{
	cgserimpl.insertOrUpdate(category);	
	return category;
}

@DeleteMapping("/list/{categoryId}")
@CrossOrigin(origins="http://localhost:4200")
public void deletion(@PathVariable int categoryId) throws Exception
{
	Category category=cgserimpl.fetchById(categoryId);
	if(category==null)
		throw new Exception ("Id is not Found"+ categoryId);
cgserimpl.delete(categoryId);
}
}
