package com.lmig.gfc.blackjack.models;

public class AceCard extends Card {

	public AceCard(Suits suit) {
		super(suit);
		// TODO Auto-generated constructor stub
	}

	@Override
	// "A" is the face for ACE.
	public String getFace() {
		return "ACE";
	}

	@Override
	// set value to 11
	// AceCard has the potential value of 11 or 1.
	public int getValue() {
		return 11;
	}

}
