package com.neosoft.service;

import com.neosoft.dto.ResponceDto;
import com.neosoft.model.User;

public interface UserService{
	
	public User saveUser(User user);
	
	public ResponceDto getUser(Integer id);

}
