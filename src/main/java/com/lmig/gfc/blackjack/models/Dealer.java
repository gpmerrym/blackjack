package com.lmig.gfc.blackjack.models;

import java.util.ArrayList;


public class Dealer {
		
	private Hand hand;
	 
	public Dealer() {
		hand = new Hand();
	}
 
	public ArrayList<Card> getHand() {
		return hand.getCards();
	}
	
	public void acceptCard(Card card) {
		hand.acceptCard(card);
		
	}

	
}
