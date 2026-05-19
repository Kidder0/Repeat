package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.example.demo.entity.User;

//import com.example.demo.entity.Employee;

public interface UserRepository extends JpaRepository<User,Integer> {

}

