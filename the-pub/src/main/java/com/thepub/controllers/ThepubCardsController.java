package com.thepub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thepub.models.ThepubCards;
import com.thepub.service.ThepubCardsService;

@RestController
public class ThepubCardsController {

	@Autowired
	private ThepubCardsService thePubCardsService;

	@PostMapping("/allCards")
	public String setCards(@RequestBody ThepubCards cards) {
		ThepubCards card = this.thePubCardsService.setCards(cards);
		return "Your card has been added successful !";
	}

	@GetMapping("/")
	public Iterable<ThepubCards> getCards() {
		Iterable<ThepubCards> allCards = this.thePubCardsService.getCards();
		return allCards;
	}

	@DeleteMapping("/deleteCard/{title}")
	public String delCard(@PathVariable String title) {
		System.out.println(title+"super hero");
		try {
			this.thePubCardsService.deleteCard(title);
			return "Your card delete successfully";
		} catch (Exception e) {
			return "Your card not deleted! please try again";
		}
	}
}
