package ch6.blackjack;

public class Card {
	private/*3점*/ String pattern;	//3점
	private String symbol;	//3점

	
	Card(){}
	Card(String pattern, String symbol){	//3점, 멤버필드에 값을 주입할 수 있는 overloaded 생성자가 있다.
		this.pattern = pattern;
		this.symbol = symbol;
	}

	public String getpattern(String pattern) {//3점, 멤버필드 카드패턴의 getter메소드 존재
		return this.pattern;
	}

	public String symbol(String symbol) {//3점, 멤버필드 카드심볼의 getter메소드 존재
		return this.symbol;
	}
	
	@Override	//3점, 아래 예처럼 동작하도록 toString 메소드를 오버라이딩한다.
	public String toString() {
		return pattern + " ("+symbol+")";
	}
	
	
	
}
