package com.zain.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class User {
	private int uid;
	private String name;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;

	public User() {
		super();
		System.out.println("User created");
	}

	public Laptop getLaptop() { 
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("Showww");
		laptop.details(); 
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

}
