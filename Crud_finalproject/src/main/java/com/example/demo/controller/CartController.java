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

import com.example.demo.entity.Cart;
import com.example.demo.service.CartServiceImpl;
//import com.example.demo.entity.Employee;
//import com.example.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/cart")
public class CartController 
{
private CartServiceImpl cserimpl; 

@Autowired
public CartController(CartServiceImpl cserimpl) {
	this.cserimpl = cserimpl;
}

@GetMapping("/list") 
//localhost:8080/employees/list
@CrossOrigin(origins="http://localhost:4200")
public List<Cart> displayDetails()
{
	return cserimpl.fetchAll();
}
@GetMapping("/list/{cartId}")
@CrossOrigin(origins="http://localhost:4200")
public Cart getById(@PathVariable int cartId) throws Exception
{
	Cart cart=cserimpl.fetchById(cartId);
	if(cart==null)
		throw new Exception("Cart id is not found : "+cartId);
 return cart;
}
@PostMapping("/add")
@CrossOrigin(origins="http://localhost:4200")
public Cart insertion(@RequestBody Cart cart)
{
	cart.setId(0);
	cserimpl.insertOrUpdate(cart);
	return cart;
}
@PutMapping("/list")
@CrossOrigin(origins="http://localhost:4200")
public Cart updation(@RequestBody Cart cart)
{
	cserimpl.insertOrUpdate(cart);	
	return cart;
}

@DeleteMapping("/list/{cartId}")
@CrossOrigin(origins="http://localhost:4200")
public void deletion(@PathVariable int cartId) throws Exception
{
	Cart cart=cserimpl.fetchById(cartId);
	if(cart==null)
		throw new Exception ("Id is not Found"+ cartId);
     cserimpl.delete(cartId);
}
}
