package com.lmig.gfc.blackjack.models;

public class NumberCard extends Card {
	
	//declare variable
	private int value;

	//constructor
	public NumberCard(Suits suit, int value) {
		super(suit);
		this.value = value;
		
	}

	@Override
	//String and Value are essentially the same?
	public String getFace() {
		return String.valueOf(value);
	}

	@Override
	public int getValue() {
		return value;
	}

}
