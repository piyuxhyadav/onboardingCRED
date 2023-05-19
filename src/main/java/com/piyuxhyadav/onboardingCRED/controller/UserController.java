package com.piyuxhyadav.onboardingCRED.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.piyuxhyadav.onboardingCRED.entity.User;
import com.piyuxhyadav.onboardingCRED.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.getUserbyId(id);
	}
	 
	@RequestMapping(method=RequestMethod.POST, value ="/users")
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	
}
