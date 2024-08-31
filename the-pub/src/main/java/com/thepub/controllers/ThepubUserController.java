package com.thepub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thepub.models.ThepubUser;
import com.thepub.service.ThepubUserService;

@RestController
@RequestMapping("/users")
public class ThepubUserController {

	@Autowired
	private ThepubUserService thePubUserService;


	@PostMapping("/register")
	public ThepubUser registerUser(@RequestBody ThepubUser thePubUser) {
		
		System.out.println(thePubUser.getFullName()+" "+thePubUser.getEmail()+" "+thePubUser.getNumber());
		ThepubUser userResult = this.thePubUserService.registerUser(thePubUser);
		return userResult;
	}
}
