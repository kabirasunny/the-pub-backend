package com.thepub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepub.dao.ThepubUserRepo;
import com.thepub.models.ThepubUser;

@Service
public class ThepubUserService {

	@Autowired
	private ThepubUserRepo thePubUserRepo;

//	save single user registeration
	
	public ThepubUser registerUser(ThepubUser user) {
		ThepubUser userResult = this.thePubUserRepo.save(user);
		return userResult;

	}
}
