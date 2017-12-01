package com.lmig.gfc.blackjack.models;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	// declare a array list variable
	private ArrayList<Card> cards;

	// contructor
	public Hand() {
		// ability to hold cards in the array list
		cards = new ArrayList<Card>();

	}

	// pass a card "object" through the accept card method
	public void acceptCard(Card card) {
		cards.add(card);
	}

	public List<Card> getCards() {
		return cards;
	}

	public int getCardSize() {
		return cards.size();
	}

	public int getTotal() {
		// loop through each card in the list
		// FOR EACH card in the list get the value.
		// add value to the list
		int sum = 0;
		int aceCounter = 0;
		for (Card card : cards) {
			sum += card.getValue();
			
			if (card.getValue() == 11) {
				aceCounter += 1;
			}
			
			while (sum > 21 && aceCounter > 0) {
				sum -= 10;
				aceCounter -= 1;
			}
			
		}
		

		return sum;

	}

	// public int getHandTotal() {
	// return handTotal;
	// }

}
