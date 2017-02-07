package poker;

public class PlayingCard {
	private char suit;
	private String face;
	private int faceValue;
	private int gameValue;

	static public final String FACES[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" }; // array of all card faces
	static public final char HEARTS = 'H';
	static public final char DIAMONDS = 'D';
	static public final char CLUBS = 'C';
	static public final char SPADES = 'S';

	public PlayingCard(String cardFace, char cardSuit, int value) {
		//Constructor only takes 3 values as it only needs 3. Face value and game value get set of of 'value'
		suit = cardSuit;
		face = cardFace;
		faceValue = value;
		if (face == "A") {
			gameValue = 14;
		} else {
			gameValue = value;
		}
	}

	public char getSuit() {
		return this.suit;
	}

	public int getGameValue() {
		return this.gameValue;
	}

	public int getFaceValue() {
		return this.faceValue;
	}

	public String toString() {
		return this.face + this.suit;
	}

}
