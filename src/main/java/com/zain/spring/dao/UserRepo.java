package com.zain.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.zain.spring.model.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
