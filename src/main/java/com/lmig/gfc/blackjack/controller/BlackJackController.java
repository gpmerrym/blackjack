package com.lmig.gfc.blackjack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.blackjack.models.Game;

@Controller

public class BlackJackController {

	private Game game;
	
	

	public BlackJackController() {
		game = new Game();

	}

	@GetMapping("/")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("default");
		return mv;
	}

	@PostMapping("/bet")
	public ModelAndView submitBet(double bet) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/play");
		
		game.makePlayerBet(bet);
		
		game.deal();
		return mv;
	}

	@GetMapping("/play")
	public ModelAndView showPlayPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("play");
		mv.addObject("game", game);
		return mv;
	}

	@GetMapping("/hit")
	public ModelAndView hit() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/play");

		game.hit();

		return mv;
	}

	@GetMapping("/stand")
	public ModelAndView stand() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/play");

		game.stand();

		return mv;
	}
	
	@GetMapping("/return")
	public ModelAndView returnToBet() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/");
		return mv;
	}

	// Hand hand = new Hand();
	// hand.acceptCard(new AceCard(Suits.DIAMONDS));
	// hand.acceptCard(new NumberCard(Suits.CLUBS, 4));
	//
	// Deck deck = new Deck();
	// //deck.pullCardFromDeck();
	// //deck.shuffle();
	//
	// //Card tempCard = deck.pullCardFromDeck();
	//
	// //System.out.println(tempCard.getFace() + " of " +
	// tempCard.getSuit().toString());
	//
	// mv.addObject("total", total);
	// mv.addObject("hand", hand);
	// mv.addObject("deck", deck);
	// //mv.addObject("card", aCard);

}
