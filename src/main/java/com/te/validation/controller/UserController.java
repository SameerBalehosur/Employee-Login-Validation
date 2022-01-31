package com.te.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.validation.model.User;
import com.te.validation.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/validate/{email}/{pass}")
	public ResponseEntity<?> validate(@PathVariable("email") String emailAddress,@PathVariable("pass") String password) {
		try {
			User authenticateUser = service.authenticateUser(emailAddress, password);
			return new ResponseEntity<String> ("validation done", HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String> ("validation failed", HttpStatus.NOT_FOUND);
		}
	}
}
