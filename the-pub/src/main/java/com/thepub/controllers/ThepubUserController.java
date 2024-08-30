package com.thepub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thepub.models.ThepubUser;
import com.thepub.service.ThepubUserService;

@RestController
@RequestMapping("/users")
public class ThepubUserController {

	@Autowired
	private ThepubUserService thePubUserService;

	@Autowired
	private ThepubUser thePubUser;

	@PostMapping("/register")
	public ThepubUser registerUser(@Param("fullName") String fullName, @Param("email") String email,
			@Param("number") long number) {

		this.thePubUser.setFullName(fullName);
		this.thePubUser.setEmail(email);
		this.thePubUser.setNumber(number);

		ThepubUser userResult = this.thePubUserService.registerUser(thePubUser);
		

		return userResult;
	}
}
