package com.crud.operations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crud.operations.model.User;
import com.crud.operations.model.response.UserResponse;
import com.crud.operations.services.UserService;

@Controller
@RequestMapping("/restful")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping( method = RequestMethod.GET)
	public @ResponseBody UserResponse getUser() {
		UserResponse userResponse = new UserResponse();
		
		userResponse.setData(userService.retrieveUser()); 
		userResponse.setMessage("Loaded data");
		userResponse.setSuccess(true);
		
		return userResponse;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody UserResponse createUser(@RequestBody User user) {
		System.out.println(user);
		UserResponse userResponse = new UserResponse();
		
		userResponse.setData(userService.createUser(user));
		userResponse.setMessage("Created new User");
		userResponse.setSuccess(true);
		
		return userResponse;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody UserResponse putUser(@RequestBody User user) {
		System.out.println("Update User "+ user);
		
		UserResponse userResponse = new UserResponse();
		
		userResponse.setData(userService.createUser(user));
		userResponse.setMessage("Updated User "+user.getId());
		userResponse.setSuccess(true);
		
		return userResponse;
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public @ResponseBody UserResponse deleteUser(@RequestBody User user) {
		System.out.println("Delete User" + user);
		
		UserResponse userResponse = new UserResponse();
		
		userService.deleteUser(user);
		userResponse.setMessage("Destroyed User "+user.getId());
		userResponse.setSuccess(true);
		
		return userResponse;

	}

}
