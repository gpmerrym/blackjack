package com.lmig.gfc.blackjack.models;

import java.util.ArrayList;

public class Player {
	
//	private double total;
	private Hand hand;
	 
	public Player() {
//		this.total = 100;
		hand = new Hand();
	}
 
//	public double getMoney() {
//		return total;
//	}
	
	public ArrayList<Card> getHand() {
		return hand.getCards();
	}
	
	public void acceptCard(Card card) {
		hand.acceptCard(card);
	}
	
	
	
	
	
 

	
	
		

}
