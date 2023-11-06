package com.neosoft.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.User;

@Repository
public interface UserRepository extends CrudRepository<User ,Serializable>{
	
	public User findById(Integer id);

}
