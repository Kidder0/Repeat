package com.example.demo.service;


import java.util.List;    

import com.example.demo.entity.User;

public interface UserService
{
	public List<User> fetchAll(); //select
	public User fetchById(int userid);  //select based on id
	public void insertOrUpdate(User user); //insert //update
	public void delete(int userid);  //delete
}