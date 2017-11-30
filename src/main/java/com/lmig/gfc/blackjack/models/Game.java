package com.lmig.gfc.blackjack.models;

import java.util.ArrayList;


public class Game {

	private Player player;
	private Deck deck;
	private Dealer dealer;
	private Hand hand;

	private double money;

	public Game() {

		money = 100;
		hand = new Hand();
		player = new Player();
		dealer = new Dealer();
		deck = new Deck();
		
		deck.shuffle();
		
	} 
 
	public void deal() {
		Card card1 = deck.pullCardFromDeck();
		Card card2 = deck.pullCardFromDeck();
		Card card3 = deck.pullCardFromDeck();
		Card card4 = deck.pullCardFromDeck();
		
		player.acceptCard(card1);
		player.acceptCard(card2);
		
		dealer.acceptCard(card3);
		dealer.acceptCard(card4);
		
		

	}

	public double getMoney() {
		return money;
	}

	public void makePlayerBet(double bet) {
		money -= bet;
	}

	public void hit() {
		Card card = deck.pullCardFromDeck();
		player.acceptCard(card);
	}
	
	public ArrayList<Card> getPlayerHand() {
		
		return player.getHand();
				
	}
	
	public ArrayList<Card> getDealerHand() {
		return dealer.getHand();
		
	}
	
//	public int getPlayerTotal() {
//		
//		
//	}
	
	
	public void stand() {
		
		
		
				
	}
	
}
	

