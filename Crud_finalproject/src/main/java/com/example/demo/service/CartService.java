package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.Cart;
//import com.example.demo.entity.Employee;

public interface CartService
{
	public List<Cart> fetchAll(); //select
	public Cart fetchById(int cartid);  //select based on id
	public void insertOrUpdate(Cart cart); //insert //update
	public void delete(int cartid);  //delete
}