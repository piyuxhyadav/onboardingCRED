package com.piyuxhyadav.onboardingCRED.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.piyuxhyadav.onboardingCRED.entity.User;
import com.piyuxhyadav.onboardingCRED.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	@GetMapping("/users")
	public List<User> getUsersByPrefix( @RequestParam(value = "prefix", defaultValue = "") String prefix,
										@RequestParam(value = "prefixType", defaultValue = "") PrefixEnum prefixType)
	{
		if (prefix.isEmpty()) {
			return userService.getUsers();
		} else {
			switch (prefixType) {
				case FIRST_NAME:
					return userService.getUsersByFirstNamePrefix(prefix);
				case LAST_NAME:
					return userService.getUsersByLastNamePrefix(prefix);
				case PHONE_NUMBER:
					return userService.getUsersByPhoneNumberPrefix(prefix);
				default:
					throw new IllegalArgumentException("Invalid prefix type: " + prefixType);
			}
	}}

	@RequestMapping(method=RequestMethod.POST, value ="/users")
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PutMapping("/users/softDelete/{id}")
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
