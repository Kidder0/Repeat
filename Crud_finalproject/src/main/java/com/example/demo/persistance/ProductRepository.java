package com.example.demo.persistance;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Product;

//import com.example.demo.entity.Employee;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	
	@Query("select d from Product d where " +
	"d.pName like concat('%',:query,'%')")  
	public List<Product> searchByQuery(String query);

}
