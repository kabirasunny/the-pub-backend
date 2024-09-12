package com.thepub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thepub.models.ThepubCards;
import com.thepub.service.ThepubCardsService;

@RestController
public class ThepubCardsController {
	
	@Autowired
	private ThepubCardsService thePubCardsService;
	@PostMapping("/allCards")
	public ThepubCards setCards(@ModelAttribute ThepubCards cards) {
		ThepubCards card = this.thePubCardsService.setCards(cards);
		return card;
	}

	@GetMapping("/")
	public Iterable<ThepubCards> getCards(){
		Iterable<ThepubCards> allCards = this.thePubCardsService.getCards();
		return allCards;
	}
}
