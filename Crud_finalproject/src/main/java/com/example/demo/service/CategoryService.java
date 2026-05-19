package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.Category;
//import com.example.demo.entity.Employee;

public interface CategoryService
{
	public List<Category> fetchAll(); //select
	public Category fetchById(int cartid);  //select based on id
	public void insertOrUpdate(Category categoey); //insert //update
	public void delete(int categoryid);  //delete
}