package ch6.blackjack;

public class CardDeck{
	private final Card[] CARD_ARR = new Card[52];
	//3점, 52개의 Card객체를 담을 수 있는 은닉화된 전역 배열 상수 존재

	public CardDeck() {		//3점, 기본 생성자 정의 (+)클래스에 public이 있는 경우에는 생성자 앞에 public을 반드시 붙여준다!!(의미가 달라짐)
							// 클래스 자체에는 접근이 가능하나, 외부에서 이 생성자에 접근하는 것이 불가능해진다.
		super();
		String[] pattern = {"Spades","Hearts","Diamonds","Clubs"};
		String[] symbole = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		int count = 0;	
		for (int i = 0; i < pattern.length; i++) {
				for (int j = 0; j < symbole.length; j++) {
					Card basket = new Card(pattern[i], symbole[j]);
					CARD_ARR[count] = basket;
					count++;
				}
				
			}

	}	

	
	Card toStr(int i) {
		return CARD_ARR[i];
	}
}