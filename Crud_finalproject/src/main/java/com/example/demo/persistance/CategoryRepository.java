package com.example.demo.persistance;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Category;
//import com.example.demo.entity.Employee;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}