package com.lmig.gfc.blackjack.models;

public class Game {

	private Player player;
	private Deck deck;
	private Dealer dealer;
	private double currentBet;
	private double currentMoney;
	

	private boolean playerBust;
	private boolean dealerBust;
	private boolean playerBlackJack;
	private boolean dealerBlackJack;

	private boolean playerWon;
	private boolean dealerWon;
	private boolean gameOver;

	public Game() {
		player = new Player();
		dealer = new Dealer();
		deck = new Deck();
		
		playerWon = false;
		dealerWon = false;
		gameOver = false;

		playerBust = false;
		dealerBust = false;
		playerBlackJack = false;
		dealerBlackJack = false;
		
		currentMoney = player.setMoney(player.getMoney() - currentBet);
		
		deck.shuffle();
	}

	public void deal() {
		
		resetFlags();
		player.makeNewHand();
		dealer.makeNewHand();
		Card card1 = deck.pullCardFromDeck();
		Card card2 = deck.pullCardFromDeck();
		Card card3 = deck.pullCardFromDeck();
		Card card4 = deck.pullCardFromDeck();
		player.acceptCard(card1);
		player.acceptCard(card2);
		dealer.acceptCard(card3);
		dealer.acceptCard(card4);
		playerBlackJack();
		dealerBlackJack();
	}
	 
	
	public void makePlayerBet(double bet) {
		currentBet = bet;
		currentMoney -= bet; 
		//currentMoney = player.setMoney(player.getMoney() - bet);		
				//player.setMoney(player.getMoney() - bet);
	}
	
	public void twoToOnePayOut() {
		currentMoney += (currentBet*(2));
	}
	
	public void threeToTwoPayOut() {
		currentMoney += (currentBet*(1.5));
	}
	
	public void addBet() {
		currentMoney += currentBet;
	}
	public void hit() {
		if (player.getHand().getTotal() < 21) {
			Card card = deck.pullCardFromDeck();
			player.acceptCard(card);
		}
		playerBust();

	}

	public void stand() {
		while (dealer.getHand().getTotal() < 17) {
			Card card = deck.pullCardFromDeck();
			dealer.acceptCard(card);
		}
		dealerBust();
		
		
		gameOverForHand();
		

	}
 
	public void gameOverForHand() {
		if (!dealerBust) {
			if (dealer.getHand().getTotal() > player.getHand().getTotal()) {
				gameOver = true;
				dealerWon = true;
			
			} 
			if (player.getHand().getTotal() > dealer.getHand().getTotal()) {
				gameOver = true;
				playerWon = true;
				twoToOnePayOut();
			}
			
			if (player.getHand().getTotal() == dealer.getHand().getTotal()) {
				gameOver = true;
				addBet();
			}

		}

	}

	public void playerBust() {
		if ((player.getHand().getTotal() > 21)) {
			playerBust = true;
			dealerWon = true;
			gameOver = true;
			
		}
	}

	public void dealerBust() {
		if ((dealer.getHand().getTotal() > 21)) {
			dealerBust = true;
			playerWon = true;
			gameOver = true;
			twoToOnePayOut();
			
			
			
		}
	}

	public void playerBlackJack() {
		if ((player.getHand().getCardSize() == 2) && (player.getHand().getTotal() == 21)) {
			playerBlackJack = true;
			playerWon = true;
			gameOver = true;
			threeToTwoPayOut();
			
			
		}
	}

	public void dealerBlackJack() {
		if ((dealer.getHand().getCardSize() == 2) && (dealer.getHand().getTotal() == 21)) {
			dealerBlackJack = true;
			dealerWon = true;
			gameOver = true;
			
		}
	}

	public void resetFlags() {
		playerBust = false;
		dealerBust = false;
		playerBlackJack = false;
		dealerBlackJack = false;
		playerWon = false;
		dealerWon = false;
		gameOver = false;
	}
	
	

	// Getters
	public Hand getPlayerHand() {
		return player.getHand();
	}

	public Hand getDealerHand() {
		return dealer.getHand();
	}

	public int getPlayerTotal() {
		return player.getHand().getTotal();
	}

	public int getDealerTotal() {
		return dealer.getHand().getTotal();
	}

	public boolean isPlayerBust() {
		return playerBust;
	}

	public boolean isDealerBust() {
		return dealerBust;
	}

	public boolean isPlayerBlackJack() {
		return playerBlackJack;
	}

	public boolean isDealerBlackJack() {
		return dealerBlackJack;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public boolean isPlayerWon() {
		return playerWon;
	}

	public boolean isDealerWon() {
		return dealerWon;
	}

	public double getCurrentBet() {
		return currentBet;
	}

	public double getCurrentMoney() {
		return currentMoney;
	}

	

}
