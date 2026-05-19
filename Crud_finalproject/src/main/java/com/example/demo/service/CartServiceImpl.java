package com.example.demo.service;


import java.util.List;     

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.persistance.CartRepository;


@Service
public class CartServiceImpl implements CartService{

	private CartRepository crep;
	
	@Autowired
	public CartServiceImpl(CartRepository crep) {
		this.crep =crep;
	}

	@Override
	@Transactional
	public List<Cart> fetchAll() {
		 return crep.findAll();
	}

	@Override
	@Transactional
	public Cart fetchById(int cartid) {
		// TODO Auto-generated method stub
		return crep.findById(cartid).get();
	}

	@Override
	@Transactional
	public void insertOrUpdate(Cart cart) {
		crep.save(cart);
	}

	@Override
	@Transactional
	public void delete(int cartid) {
		crep.deleteById(cartid);	
	}
}