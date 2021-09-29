package com.metroAG.ques3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metroAG.ques3.entities.User;

import com.metroAG.ques3.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService user;

	@GetMapping("/")
	public String home() {
		return "This is home page";
	}
	
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return this.user.getUsers();
	}
	
	
	@GetMapping("users/{id}")
	public User getUser(@PathVariable int id)  {
		return this.user.getUser(id);
	}
	
	
	
	@PostMapping("/users/add")
	public User addUser(@RequestBody User user) {
		return this.user.addUser(user);
		
	}
	
	@GetMapping("/users/sort")
	public List<User> sortUsers(){
		return this.user.sortUsers();
	}
	
}





