package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.example.demo.entity.Cart;
//import com.example.demo.entity.Employee;

public interface CartRepository extends JpaRepository<Cart,Integer> 
{

}

