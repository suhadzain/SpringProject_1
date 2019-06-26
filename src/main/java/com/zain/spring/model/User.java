package com.zain.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
//@Scope(value="prototype")
@Entity
public class User {
	@Id
	private int uid;
	private String name; 
	private String tech;
//	@Autowired
//	@Qualifier("lap1")
//	private Laptop laptop;

	public User() {
		super();
		System.out.println("User created");
	}

//	public Laptop getLaptop() { 
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

	public User(int uid, String name, String tech) {
		super();
		this.uid = uid;
		this.name = name;
		this.tech = tech;
	}

	public void show() {
		System.out.println("Showww");
//		laptop.details(); 
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
