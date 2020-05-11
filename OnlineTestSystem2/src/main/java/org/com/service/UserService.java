package org.com.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.com.dao.UserRepository;
import org.com.error.RecordNotFoundException;
import org.com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);		
	}
	

	public List<User> findAllUser() {
		return userRepository.findAll();		
	}


	public void deleteUser(long uid) {
		userRepository.deleteById(uid);
	}


	public User save(@Valid User u1) {
		return userRepository.save(u1);
	}


	


	
	
		
}