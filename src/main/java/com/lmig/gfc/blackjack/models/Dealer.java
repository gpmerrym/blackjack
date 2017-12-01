package com.lmig.gfc.blackjack.models;

import java.util.ArrayList;


public class Dealer {
		
	private Hand hand;
	 
	public Dealer() {
		hand = new Hand();
	}
 
	public Hand getHand() {
		return hand;
	}
	
	public void acceptCard(Card card) {
		hand.acceptCard(card);
		
	}

	public void makeNewHand() {
		hand = new Hand();
		
	}

	
}
