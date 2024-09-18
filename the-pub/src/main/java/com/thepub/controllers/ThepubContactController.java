package com.thepub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thepub.models.ThepubContact;
import com.thepub.service.ThepubContactService;

@RestController
public class ThepubContactController {

	@Autowired
	private ThepubContactService service;
	
	@PostMapping("/contact")
	public String setContact(@RequestBody ThepubContact contact) {
		ThepubContact result = this.service.setContact(contact);
		if(result==null) {
			return "please insert correct data";
		}else {
			return "Thank you for cotact us!";
		}
	}
}
