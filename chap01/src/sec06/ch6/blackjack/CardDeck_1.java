package ch6.blackjack;
//CardDeck - 방법 3
public class CardDeck_1 {
		public final static String[] CARD_PATTERNS_1 = {"Spades","Hearts","Diamonds","Clubs"};
		public final static String[] CARD_SYMBOLS = {"A","2","3","4","5","6","7","8","9","J","Q","K"};

		private final int EACH_CARD_LEN = 13;
		private final Card[] CARD_ARR; //- 이거 가능한 이유는 아래에서 값을 넣어주고 있기 때문에 ;에서 마칠 수 있음
		public CardDeck_1() {
			CARD_ARR = new Card[CARD_PATTERNS_1.length * EACH_CARD_LEN];
			init2();
		}
		
		private void init2() {
			int idx = 0;
			for(String pattern : CARD_PATTERNS_1) {
				for(String symbol : CARD_SYMBOLS) {
					CARD_ARR[idx++] = new Card(pattern,symbol);
				}
			}
		}
	}
