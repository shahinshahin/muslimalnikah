package com.muslimalnikah.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.muslimalnikah.model.RegisterUser;
import com.muslimalnikah.model.loggingUser;
import com.muslimalnikah.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	private static Logger log = Logger.getLogger(UserController.class);
//	@RequestMapping("/getuser/{id}")
//	public loggingUser getUser(@PathVariable("id") int id)
//	{
//		
//		return userService.getUserById(id);
//	}
	@CrossOrigin(origins = "http://localhost:3000")
	 @GetMapping("/getuser/{id}")
	   public ResponseEntity<loggingUser> get(@PathVariable("id") int id) {
		   loggingUser loggingUser = userService.getUserById(id);
	      return ResponseEntity.ok().body(loggingUser);
	   }
	   @CrossOrigin(origins = "http://localhost:3000")
	   @RequestMapping(value = "/registerusers" ,produces = "application/json",  method = {RequestMethod.POST})
		public ResponseEntity<?> createCustomer(@RequestBody RegisterUser registerUser) {

		   userService.addregUser(registerUser);

			return new ResponseEntity<RegisterUser>(registerUser, HttpStatus.OK);
		}
	  // @CrossOrigin(origins = "http://localhost:3000")
	   @RequestMapping(value = "/validate", method = RequestMethod.POST)
	    public String validateUsr(@RequestParam("username")String username, @RequestParam("password")String password) {
	        String msg = "";
	        boolean isValid = userService.findUser(username, password);
	        log.info("Is user valid?= " + isValid);
	 
	        if(isValid) {
	            msg = "Welcome " + username + "!";
	        } else {
	            msg = "Invalid credentials";
	        }
	 
	        return msg;
	    }
	}
	   

