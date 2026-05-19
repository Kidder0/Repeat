package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	@Column(name = "id")
	private int Id;

	@Column(name = "p_name")
	private String pName;
	@Column(name = "p_img")
	private String pImg;
	@Column(name = "p_weight")
	private float pWeight;
	@Column(name = "p_price")
	private float pPrice;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int id, String pName, String pImg, float pWeight, float pPrice) {
		super();
		Id = id;
		this.pName = pName;
		this.pImg = pImg;
		this.pWeight = pWeight;
		this.pPrice = pPrice;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
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

	public float getpPrice() {
		return pPrice;
	}

	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "Cart [Id=" + Id + ", pName=" + pName + ", pImg=" + pImg + ", pWeight=" + pWeight + ", pPrice=" + pPrice
				+ "]";
	}


}