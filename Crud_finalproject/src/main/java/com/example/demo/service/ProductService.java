package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.Product;    

//import com.example.demo.entity.Employee;

public interface ProductService
{
	public List<Product> fetchAll(); //select
	public Product fetchById(int productid);  //select based on id
	public void insertOrUpdate(Product product); //insert //update
	public void delete(int productid);  //delete
	public List<Product> searchBy(String query);
}