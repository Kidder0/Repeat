package com.example.demo.entity;


import javax.persistence.Column;    
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product
{
@Id  //indicates primary key in table
@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
@Column(name="p_id")
private int pId;
//@ManyToOne

@Column(name="p_cid")
private int pCId;
@Column(name="p_name")
private String pName;
@Column(name="p_description")
private String pDescription;
@Column(name="p_price")
private float pPrice;
@Column(name="p_img")
private String pImg;
@Column(name="p_weight")
private float pWeight;
public Product() {

}
public Product(int pId, int pCId, String pName, String pDescription, float pPrice, String pImg, float pWeight) {
	
	this.pId = pId;
	this.pCId = pCId;
	this.pName = pName;
	this.pDescription = pDescription;
	this.pPrice = pPrice;
	this.pImg = pImg;
	this.pWeight = pWeight;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public int getpCId() {
	return pCId;
}
public void setpCId(int pCId) {
	this.pCId = pCId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpDescription() {
	return pDescription;
}
public void setpDescription(String pDescription) {
	this.pDescription = pDescription;
}
public float getpPrice() {
	return pPrice;
}
public void setpPrice(float pPrice) {
	this.pPrice = pPrice;
}
public String getpImg() {
	return pImg;
}
public void setpImg(String pImg) {
	this.pImg = pImg;
}
public float getpWeight() {
	return pWeight;
}
public void setpWeight(float pWeight) {
	this.pWeight = pWeight;
}
@Override
public String toString() {
	return "Product [pId=" + pId + ", pCId=" + pCId + ", pName=" + pName + ", pDescription=" + pDescription
			+ ", pPrice=" + pPrice + ", pImg=" + pImg + ", pWeight=" + pWeight + "]";
}




















}