package com.lmig.gfc.blackjack.models;

public class FaceCard extends Card {
	
	//declare variable face with type Faces
	private Faces face;

	//constructor
	public FaceCard(Suits suit, Faces face) {
		super(suit);
		this.face = face;
		
	}

	@Override
	public String getFace() {
		return face.toString();
		
	}

	@Override
	//Jack, Queen, King have value of 10.
	public int getValue() {
		
		return 10;
	}
	
	
	

}
