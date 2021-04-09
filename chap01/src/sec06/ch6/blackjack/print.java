package ch6.blackjack;
import ch6.blackjack.CardDeck;
public class print {

	public static void main(String[] args) {
		
		CardDeck d = new CardDeck();
	
		int i = (int)(Math.random()*53);
//		for(int i = 0; i < 52; i++) {
//			System.out.println(d.toStr(i));
//		}
		System.out.println(d.toStr(i));
	}

}
