package com.database.test.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.test.entities.User;
import com.database.test.services.abstracts.UserService;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping(path = "/getAll")
	public List<User> getAll() {
		return userService.getAll();
	}

}
