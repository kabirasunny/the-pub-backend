package com.thepub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepub.dao.ThepubCardsRepo;
import com.thepub.models.ThepubCards;

@Service
public class ThepubCardsService {

	@Autowired
	private ThepubCardsRepo thePubCardsRepo;
	
	public ThepubCards setCards(ThepubCards cards) {
		ThepubCards card = this.thePubCardsRepo.save(cards);
		return card;
	}
	
	public Iterable<ThepubCards> getCards() {
		Iterable<ThepubCards> allCards = this.thePubCardsRepo.findAll();
		return allCards;
	}
}
