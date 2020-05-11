package org.com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.com.dao.UserRepository;
import org.com.error.RecordNotFoundException;

import org.com.model.User;
import org.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(value="http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/allUser")
	public List<User> getAllUser(){
		 return userService.findAllUser();
	}
	@RequestMapping("/searchUser/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public  ResponseEntity<?> findUser1(@PathVariable("id")long uid){
		
		Optional<User> findById=userService.findById(uid);
		try {
		if(findById.isPresent()) 
		{
        User user=findById.get();
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
		else
			throw new RecordNotFoundException("User not found");
		}
		catch(RecordNotFoundException e){
		return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	}

	@PostMapping("/addUser")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<User> saveProduct2(@RequestBody User user){
		
		Optional<User> findById=userService.findById(user.getUserId());
		try {
		if(!findById.isPresent()) {
			userService.save(user);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		else
			throw new RecordNotFoundException("record already present...");
		}
		catch(RecordNotFoundException e) {
			
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	

	@PostMapping("/saveUser")
	
	public User createUser(@Valid @RequestBody User u1) {
		return userService.save(u1);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	
	public String removeUser(@PathVariable("id")long uid){
		
		Optional<User> findById=userService.findById( uid);
		if(findById.isPresent()) {
			userService.deleteUser(uid);
			return "user removed";
		}
		return "user not present";
}
	@PutMapping("/updateUser/")
	
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user){
		
		Optional<User> findById=userService.findById(user.getUserId());
		try {
		if(findById.isPresent()) {
			userService.save(user);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		else {
			throw new RecordNotFoundException("User Profile not found");
		}}
		catch(RecordNotFoundException e){
		return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
	}
		}
		
}
	 
	
