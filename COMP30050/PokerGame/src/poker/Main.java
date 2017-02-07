package poker;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<PlayingCard> hand = new ArrayList<PlayingCard>();
		DeckOfCards deck = new DeckOfCards();
		System.out.println(deck.deck);
		PlayingCard card = deck.dealNext();
		System.out.println(card.toString());
		deck.returnCard(card);
		System.out.println(deck.deck);
		deck.shuffle();
		for(int i = 0; i < 5; i++){
			hand.add(deck.dealNext());
		}
		System.out.println(deck.deck);
		for(int i = 0; i < 5; i++){
			deck.returnCard(hand.get(i));
		}
		System.out.println(deck.deck);
		for(int i = 0; i < 55; i++){
			hand.add(deck.dealNext());
		}
		System.out.println(deck.deck);
		deck.reset();
		System.out.println(deck.deck);
		
		// Print out all cards 
	}

}

