package com.naeemsiddiq.swaggerui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1/api/message")
public class MessageApiController {

	@PostMapping("/")
	@ApiOperation("Create a Message")
	public String create() {
		return "Hello Message Created";
	}
	
	@PutMapping("/")
	@ApiOperation("Update a Message")
	public String update() {
		return "Updated Hello Message";
	}
	
	@DeleteMapping("/")
	@ApiOperation("Delete a Message")
	public String delete() {
		return "Deleted Hello Message";
	}
	
	@GetMapping("/")
	@ApiOperation("Find a Message")
	public String Find() {
		return "Hello Message found";
	}

}
