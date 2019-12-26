package com.muslimalnikah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.muslimalnikah.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value="/getuser",method=RequestMethod.GET)
	public UserService getUser()
	{
		userService.setId(1);
		userService.setName("shahin");
		userService.setPassword("shahin");
		return userService;
	}

}
