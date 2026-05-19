package com.example.demo.service;


import java.util.List;    

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.persistance.ProductRepository;
//import com.example.demo.persistance.ProductRepository;
 

@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepository prep;
	
	@Autowired
	//private ProductRepository prep;
	public ProductServiceImpl(ProductRepository prep) {
		this.prep =prep;
	}

	@Override
	@Transactional
	public List<Product> fetchAll() {
		 return prep.findAll();
	}

	@Override
	@Transactional
	public Product fetchById(int productid) {
		// TODO Auto-generated method stub
		return prep.findById(productid).get();
	}

	@Override
	@Transactional
	public void insertOrUpdate(Product product) {
		prep.save(product);
	}

	@Override
	@Transactional
	public void delete(int productid) {
		prep.deleteById(productid);	
	}

	
	public List<Product> searchBy(String query) {
		List<Product> product=null;
		product=prep.searchByQuery(query);
	return product;
	}
	
}