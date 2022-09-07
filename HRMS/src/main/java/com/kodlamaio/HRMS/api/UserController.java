package com.kodlamaio.HRMS.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.HRMS.bussines.abstracts.UserService;
import com.kodlamaio.HRMS.entities.concretes.User;

@RestController
@RequestMapping(path = "/api")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(path = "/users")
	public User getUserById(int id) {
		return userService.getUserById(id);
	}

}
