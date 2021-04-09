package ch6.blackjack;

public class CardDeck_2 {
	public final static String[] CARD_PATTERNS_1 = {"Spades","Hearts","Diamonds","Clubs"};
	public final static String[] CARD_SYMBOLS = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
	
	private final int EACH_CARD_LEN = 13;
	private final Card[];
	
	for(int i = 0; i < pattern.length; i++) {
		for(int j = 1; j <= EACH_CARD_LEN; j++) {
			String symbol = " ";
			switch(j) {
			case 1:
				symbol = "A"; break;
			case 11:
				symbol = "J"; break;
			case 12:
				symbol = "Q"; break;
			case 13:
				symbol = "K"; break;
			default:
				symbol = Integer.toString(j);
				break;
			}
			//int idx = (i*EACH_CARD_LEN) + (j-1);
	CARD_ARR[idx++] = new Card(pattern[i], symbol);	//3점, 배열에 모든 card 객체를 담는다.
		}
	}
	}

//void CardDeck1() {
//	init();
//}

//private void init() {
//	private final int EACH_CARD_LEN = 13;
//	int idx = 0;
//	for(int i = 0; i < pattern.length; i++) {
//		for(int j = 1; j <= EACH_CARD_LEN; j++) {
//			String symbol = null;
//			switch(j) {
//			case 0:
//				symbol = "A"; break;
//			case 10:
//				symbol = "J"; break;
//			case 11:
//				symbol = "Q"; break;
//			case 12:
//				symbol = "K"; break;
//			default:
//				symbol = Integer.toString(j+1);
//			default:
//				symbol = String.valueOf(z); //이거사용추천!!!(유연스)
//			default:
//				symbol = (String)z;
//				break;
//			}
//			//int idx = (i*EACH_CARD_LEN) + (j-1);
//			CARD_ARR[idx++] = new Card(CARD_PATTERNS[i], symbol);
//			CARD_ARR[(i * EACH_CARD_LEN) + (z-1)]  = new Card(pattern
//		}
//	}
//}      
}
