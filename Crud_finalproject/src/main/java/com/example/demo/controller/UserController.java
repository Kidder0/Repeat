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

import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController 
{
private UserServiceImpl userimpl;

@Autowired
public UserController(UserServiceImpl userimpl) {
	this.userimpl = userimpl;
}

@GetMapping("/list") 
//localhost:8080/employees/list
@CrossOrigin(origins="http://localhost:4200")
public List<User> displayDetails()
{
	return userimpl.fetchAll();
}
@GetMapping("/list/{userId}")
@CrossOrigin(origins="http://localhost:4200")
public User getById(@PathVariable int userId) throws Exception
{
	User user=userimpl.fetchById(userId);
	if(user==null)
		throw new Exception("User id is not found : "+userId);
 return user;
}
@PostMapping("/add")
@CrossOrigin(origins="http://localhost:4200")
public User insertion(@RequestBody User user)
{
	user.setuId(0);
	userimpl.insertOrUpdate(user);
	return user;
}
@PutMapping("/list")
@CrossOrigin(origins="http://localhost:4200")
public User updation(@RequestBody User user)
{
	userimpl.insertOrUpdate(user);	
	return user;
}

@DeleteMapping("/list/{userId}")
@CrossOrigin(origins="http://localhost:4200")
public void deletion(@PathVariable int userId) throws Exception
{
	User user=userimpl.fetchById(userId);
	if(user==null)
		throw new Exception ("Id is not Found"+ userId);
userimpl.delete(userId);
}
}
