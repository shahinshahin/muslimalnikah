package com.muslimalnikah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.muslimalnikah.model.loggingUser;
import com.muslimalnikah.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
//	@RequestMapping("/getuser/{id}")
//	public loggingUser getUser(@PathVariable("id") int id)
//	{
//		
//		return userService.getUserById(id);
//	}
	 @GetMapping("/getuser/{id}")
	   public ResponseEntity<loggingUser> get(@PathVariable("id") long id) {
		   loggingUser loggingUser = userService.getUserById(id);
	      return ResponseEntity.ok().body(loggingUser);
	   }
	
}
