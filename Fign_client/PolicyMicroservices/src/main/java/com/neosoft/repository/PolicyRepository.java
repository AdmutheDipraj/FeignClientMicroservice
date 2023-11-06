package com.neosoft.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.Policy;

@Repository
public interface PolicyRepository extends CrudRepository<Policy, Serializable>{
	
	public Policy findById(Integer id);

}
