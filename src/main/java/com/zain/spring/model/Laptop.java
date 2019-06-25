package com.zain.spring.model;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private int lid;
	private String brand;

	public Laptop() {
		super();
		System.out.println("laptop created");
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void details() {
		System.out.println("laptop details");
	}
}
