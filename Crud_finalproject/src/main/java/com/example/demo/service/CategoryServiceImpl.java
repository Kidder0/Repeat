package com.example.demo.service;


import java.util.List;     

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Category;
import com.example.demo.persistance.CartRepository;
import com.example.demo.persistance.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService{

	private CategoryRepository cgep;
	
	@Autowired
	public CategoryServiceImpl(CategoryRepository cgep) {
		this.cgep =cgep;
	}

	@Override
	@Transactional
	public List<Category> fetchAll() {
		 return cgep.findAll();
	}

	@Override
	@Transactional
	public Category fetchById(int categoryid) {
		// TODO Auto-generated method stub
		return cgep.findById(categoryid).get();
	}

	@Override
	@Transactional
	public void insertOrUpdate(Category category) {
		cgep.save(category);
	}

	@Override
	@Transactional
	public void delete(int categoryid) {
		cgep.deleteById(categoryid);	
	}
}
	
	
