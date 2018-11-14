package com.naeemsiddiq.swaggerui.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.naeemsiddiq.swaggerui.dto.User;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1/api/user")
public class UserApiController {

	@PostMapping("/")
	@ApiOperation(value = "Create a User")
	public User create(@Valid @RequestBody User user) throws Exception {
		if (user == null)
			throw new Exception("You enter user credentials");
		else
			return user;
	}

	@GetMapping("/")
	@ApiOperation(value = "Get All User")
	public List<User> getAll() {
		List<User> users = new ArrayList<>();
		users.add(new User(1l, "user1", "user1@swaggerui.com", "123, swaggerHouse1, learnSwagger", "123456"));
		users.add(new User(2l, "user2", "user2@swaggerui.com", "456, swaggerHouse2, learnSwagger", "789100"));
		users.add(new User(3l, "user3", "user3@swaggerui.com", "789, swaggerHouse3, learnSwagger", "454568"));
		users.add(new User(4l, "user4", "user4@swaggerui.com", "012, swaggerHouse4, learnSwagger", "662223"));
		users.add(new User(5l, "user5", "user5@swaggerui.com", "345, swaggerHouse5, learnSwagger", "562122"));
		return users;
	}

	@PutMapping("/{id}")
	public String update(@PathVariable Long id) {
		return "User with id " + id + " updated succesfully";
	}
}
