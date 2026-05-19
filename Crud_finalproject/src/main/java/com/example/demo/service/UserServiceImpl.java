package com.example.demo.service;


import java.util.List;     

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.persistance.UserRepository;
 

@Service
public class UserServiceImpl implements UserService{

	private UserRepository urep;
	
	@Autowired
	public UserServiceImpl(UserRepository urep) {
		this.urep =urep;
	}

	@Override
	@Transactional
	public List<User> fetchAll() {
		 return urep.findAll();
	}

	@Override
	@Transactional
	public User fetchById(int userid) {
		// TODO Auto-generated method stub
		return urep.findById(userid).get();
	}

	@Override
	@Transactional
	public void insertOrUpdate(User user) {
		urep.save(user);
	}

	@Override
	@Transactional
	public void delete(int userid) {
		urep.deleteById(userid);	
	}
}
