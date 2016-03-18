/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String [] ranks = {"Jack", "Queen", "King", "Ace"};
		String [] suits = {"Spades", "Clubs", "Diamond", "Hearts"};
		int [] pointValues = {1, 2, 3, 4};
		
		Deck deck1 = new Deck(ranks, suits, pointValues);
		Deck deckR = new Deck(ranks, suits, pointValues);
		Deck deckC = new Deck(ranks, suits, pointValues);
		Deck deckE = new Deck(ranks, suits, pointValues);
		
		
	}
}
