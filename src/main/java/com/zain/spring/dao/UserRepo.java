package com.zain.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.zain.spring.model.User; 

public interface UserRepo extends CrudRepository<User, Integer>{

	User findByTech(String string);
	
	List<User> findByUidGreaterThan(int uid);
	
	@Query("from User where tech = ?1 order by name")
	List<User> findByTechSorted(String tech);

}
