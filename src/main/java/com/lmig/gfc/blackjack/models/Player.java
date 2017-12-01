package com.lmig.gfc.blackjack.models;

public class Player {

	
	private Hand hand;
	private double money;

	public Player() {
		money = 100;
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

	public double getMoney() {
		return money;
	}

	public double setMoney(double money) {
		return this.money = money;
	}

}
