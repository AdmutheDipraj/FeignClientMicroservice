package com.neosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.neosoft.dto.ResponceDto;
import com.neosoft.model.User;
import com.neosoft.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User saveusers = userService.saveUser(user);
		return saveusers;
		
	}
	@GetMapping("/getUser/{id}")
	public ResponceDto getUser(@PathVariable("id") Integer id) {
		ResponceDto responcedto = userService.getUser(id);
		return responcedto;
		
	}

}
