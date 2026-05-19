package com.example.demo.entity;


import javax.persistence.Column;    
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pcategory")
public class Category
{
@Id  //indicates primary key in table
@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
//@OneToMany
@Column(name="p_cid")
private int pCId;
@Column(name="p_cname")
private String pCName;

public Category() 
{

}

public Category(int pCId, String pCName)
{
	
	this.pCId = pCId;
	this.pCName = pCName;
}

public int getpCId() 
{
	return pCId;
}

public void setpCId(int pCId)
{
	this.pCId = pCId;
}

public String getpCName() 
{
	return pCName;
}

public void setpCName(String pCName) {
	this.pCName = pCName;
}

@Override
public String toString() {
	return "Category [pCId=" + pCId + ", pCName=" + pCName + "]";
}


























}