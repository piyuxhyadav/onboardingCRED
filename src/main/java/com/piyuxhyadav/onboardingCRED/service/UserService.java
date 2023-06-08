package com.piyuxhyadav.onboardingCRED.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.piyuxhyadav.onboardingCRED.entity.User;
import com.piyuxhyadav.onboardingCRED.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {return userRepository.save(user);}
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	public User getUserById(Integer id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public User updateUser(User user) { 
		return userRepository.save(user);
	}

	public void deleteUser(Integer id) {
		userRepository.delete(Objects.requireNonNull(userRepository.findById(id).orElse(null)));

	}
	public List<User> getUsersByFirstNamePrefix(String prefix) {
		return userRepository.findByFirstNameStartingWith(prefix);
	}
	public List<User> getUsersByLastNamePrefix(String prefix) {
		return userRepository.findByLastNameStartingWith(prefix);
	}
	public List<User> getUsersByPhoneNumberPrefix(String prefix) {
		return userRepository.findByPhoneNumberStartingWith(prefix);
	}

	public User softDeleteUser(Integer id) {
		User user = userRepository.findById(id).orElse(null);
		assert user != null;
		user.setSoftDelete("true");
		return user;
	}

}
