package com.thepub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepub.dao.ThepubContactRepo;
import com.thepub.models.ThepubCards;
import com.thepub.models.ThepubContact;

@Service
public class ThepubContactService {

	@Autowired
	private ThepubContactRepo thePubContact;

	
	public ThepubContact setContact(ThepubContact contact) {
		ThepubContact result = this.thePubContact.save(contact);
		return result;
	}
}
