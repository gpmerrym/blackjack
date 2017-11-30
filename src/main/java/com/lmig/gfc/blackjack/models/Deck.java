package com.lmig.gfc.blackjack.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();
		
		// CLUBS
		for (int i = 2; i < 11; i += 1) {
			cards.add(new NumberCard(Suits.CLUBS, i));
		}
		
		cards.add(new FaceCard(Suits.CLUBS, Faces.JACK));
		cards.add(new FaceCard(Suits.CLUBS, Faces.QUEEN));
		cards.add(new FaceCard(Suits.CLUBS, Faces.KING));
		cards.add(new AceCard(Suits.CLUBS));
		
		// HEARTS
		for (int i = 2; i < 11; i += 1) {
			cards.add(new NumberCard(Suits.HEARTS, i));
		}
		
		cards.add(new FaceCard(Suits.HEARTS, Faces.JACK));
		cards.add(new FaceCard(Suits.HEARTS, Faces.QUEEN));
		cards.add(new FaceCard(Suits.HEARTS, Faces.KING));
		cards.add(new AceCard(Suits.HEARTS));
		
		// DIAMONDS
		for (int i = 2; i < 11; i += 1) {
			cards.add(new NumberCard(Suits.DIAMONDS, i));
		}
		
		cards.add(new FaceCard(Suits.DIAMONDS, Faces.JACK));
		cards.add(new FaceCard(Suits.DIAMONDS, Faces.QUEEN));
		cards.add(new FaceCard(Suits.DIAMONDS, Faces.KING));
		cards.add(new AceCard(Suits.DIAMONDS));
		
		// SPADES
		for (int i = 2; i < 11; i += 1) {
			cards.add(new NumberCard(Suits.SPADES, i));
		}
		cards.add(new FaceCard(Suits.SPADES, Faces.JACK));
		cards.add(new FaceCard(Suits.SPADES, Faces.QUEEN));
		cards.add(new FaceCard(Suits.SPADES, Faces.KING));
		cards.add(new AceCard(Suits.SPADES));

	}

	public void addCardToDeck(Card card) {
		cards.add(card);
	}
	
	public Card pullCardFromDeck() {
		return cards.remove(0);
		
	}
	
	public List<Card> getDeck() {
		return cards;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}

	// create a new deck with Stack or Arraylist
	// fill the deck
	// shuffle the deck
	// grab card from the deck
	
}
