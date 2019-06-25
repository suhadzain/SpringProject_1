package com.zain.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zain.spring.model.User;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		User a = context.getBean(User.class);
		a.show(); 
//		
//		User b = context.getBean(User.class);
//		b.show();
	}

}
