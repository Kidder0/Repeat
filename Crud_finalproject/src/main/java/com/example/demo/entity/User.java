package com.example.demo.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;    
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User
{
	
@Id  //indicates primary key in table
@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
//@OneToMany
@Column(name="u_id")
private int uId;
@Column(name="u_name")
private String uName;
@Column(name="u_password")
private int password;
@Column(name="u_address")
private String uAddress;
@Column(name="u_emailid")
private String email;
@Column(name="u_phoneno")
private double uPhoneNo;
@Column(name="u_type")
private String uType;

public User() 
{

}

public User(int uId, String uName, int password, String uAddress, String email, double uPhoneNo ,String uType) {
	
	this.uId = uId;
	this.uName = uName;
	this.password = password;
	this.uAddress = uAddress;
	this.email = email;
	this.uPhoneNo = uPhoneNo;
	this.uType=uType;
}

public String getuType() {
	return uType;
}

public void setuType(String uType) {
	this.uType = uType;
}

public int getuId() {
	return uId;
}

public void setuId(int uId) {
	this.uId = uId;
}

public String getuName() {
	return uName;
}

public void setuName(String uName) {
	this.uName = uName;
}

public int getPassword() {
	return password;
}

public void setPassword(int password) {
	this.password = password;
}

public String getuAddress() {
	return uAddress;
}

public void setuAddress(String uAddress) {
	this.uAddress = uAddress;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public double getuPhoneNo() {
	return uPhoneNo;
}

public void setuPhoneNo(double uPhoneNo) {
	this.uPhoneNo = uPhoneNo;
}

@Override
public String toString() {
	return "User [uId=" + uId + ", uName=" + uName + ", password=" + password + ", uAddress=" + uAddress + ", email="
			+ email + ", uPhoneNo=" + uPhoneNo + ", uType=" + uType + "]";
}




























}
