package com.git.CRUD.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.git.CRUD.model.User;
import com.git.CRUD.service.UserService;

import jakarta.persistence.PostUpdate;

@RestController
public class UserController {
	
	
		@Autowired
		UserService userSer;
		
		@GetMapping("/getalluser")
		public List<User> getAllUser(){
			return userSer.getAllUser();
		}
		
		@GetMapping("/getuser/{id}")
		public Optional<User> getUser(@PathVariable Long id) {
			return userSer.getUser(id);
		}
		
		@PostMapping("/saveuser")
		public User saveUser(@RequestBody User user) {
			return userSer.saveUser(user);
		}
		
		@PutMapping("/updateuser")
		public User updateUser(@RequestBody User user) {
			return userSer.updateUser(user);
		}
		
		@DeleteMapping("/deleteuser/{id}")
		public void deleteuser(@PathVariable Long id) {
			userSer.deleteUser(id);
		}
}
