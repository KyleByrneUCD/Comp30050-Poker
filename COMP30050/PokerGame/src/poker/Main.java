package poker;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<PlayingCard> hand = new ArrayList<PlayingCard>();
		DeckOfCards deck = new DeckOfCards();	// Create deck of cards
		System.out.println(deck.getDeck());		// Print Deck
		PlayingCard card = deck.dealNext();		// Deal a card
		System.out.println(card.toString());	// Print the dealt card
		System.out.println(deck.getDeck());		// Print Deck
		deck.returnCard(card);					// Return the card to the deck
		System.out.println(deck.getDeck());		// Print Deck
		deck.shuffle();							// Shuffle the deck
		for(int i = 0; i < 5; i++){
			hand.add(deck.dealNext());			// Deal 5 cards
		}
		System.out.println(deck.getDeck());		// Print Deck
		for(int i = 0; i < 5; i++){
			deck.returnCard(hand.get(i));		// Return the 5 cards
		}
		System.out.println(deck.getDeck());		// Print Deck
		for(int i = 0; i < 55; i++){
			hand.add(deck.dealNext());			// Deal more cards than are available
		}
		System.out.println(deck.getDeck());		// Print Deck
		deck.reset();							// Reset Deck
		System.out.println(deck.getDeck());		// Print Deck
		
		// Print out all cards 
	}

}

