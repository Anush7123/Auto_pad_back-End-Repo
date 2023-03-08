package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class model {
	@Id
	private int sno;
	private String brand;
	private String model;
	private int price;
	private int top_speed;
	
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTop_speed() {
		return top_speed;
	}

	public void setTop_speed(int top_speed) {
		this.top_speed = top_speed;
	}
	
	public model(int sno, String brand, String model, int price, int top_speed) {
		super();
		this.sno = sno;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.top_speed = top_speed;
	}

	
	public model() {
		
	}
	
	
	public String toString() {
		return "sno="+sno+"brand="+brand+"model="+model+"price="+price+"top_speed="+top_speed;
	}
}