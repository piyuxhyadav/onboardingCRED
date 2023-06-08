package com.piyuxhyadav.onboardingCRED.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
		return userService.getUserById(id);
	}
	 
	@RequestMapping(method=RequestMethod.POST, value ="/users")
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PutMapping("/users/{id}/softDelete")
	public User softDelete(@PathVariable Integer id) {
		return userService.softDeleteUser(id);
	}
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
