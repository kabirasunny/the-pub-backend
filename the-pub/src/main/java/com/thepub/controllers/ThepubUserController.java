package com.thepub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thepub.models.ThepubUser;
import com.thepub.service.ThepubUserService;

@RestController
@RequestMapping("/users")
public class ThepubUserController {

	@Autowired
	private ThepubUserService thePubUserService;

// Save single data of user the-pub website
	
	@PostMapping("/register")
	public String registerUser(@RequestBody ThepubUser thePubUser) {
		try {
			ThepubUser result = this.thePubUserService.registerUser(thePubUser);
			return "Successfully registration";
			
		} catch (Exception e) {
			return "this number is already registered";
		}
	}
	
//	Get single data of user by number of the-pub website
	@GetMapping("/getData/{number}")
	public ThepubUser getUser(@PathVariable long number) {
		ThepubUser userResult = this.thePubUserService.getUser(number);
		if(userResult.getNumber()==number) {
			System.out.println(userResult);
			return userResult;
		}else {
			ThepubUser resultUser = userResult;
			return resultUser;
		}
		
	}
}
