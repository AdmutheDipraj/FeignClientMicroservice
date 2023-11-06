package com.neosoft.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.dto.PolicyDto;
import com.neosoft.dto.ResponceDto;
import com.neosoft.dto.UserDto;
import com.neosoft.model.User;
import com.neosoft.repository.UserRepository;
import com.neosoft.service.ApiClient;
import com.neosoft.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ApiClient apiClient; 
	
	@Override
	public User saveUser(User user) {
		User saveUser = userRepository.save(user);
		return saveUser;
	}

	@Override
	public ResponceDto getUser(Integer id) {
		ResponceDto responceDto=new ResponceDto();
		User users = userRepository.findById(id);
		PolicyDto polices = apiClient.getPolicyById(users.getId());
		UserDto userdto=mapToUser(users);
		
		responceDto.setUserDto(userdto);
		responceDto.setPolicyDto(polices);
		return responceDto;
	}

	private UserDto mapToUser(User users) {
		UserDto userDto =new UserDto();
		userDto.setId(users.getId());
		userDto.setFirstName(users.getFirstName());
		userDto.setLastName(users.getLastName());
		userDto.setEmail(users.getEmail());
		return userDto;
	}
	
	

}
