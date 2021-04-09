package ch6.blackjack;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card("Spade","K");
		System.out.println(c1);				//Spade (K)
		
//		System.out.println >> c1,c2를 넣었을 때는 (Object x)가 받는다!
		
		Card c2 = new Card("Heart","2");
		System.out.println(c2);
//		System.out.println(c2.toString());				//Heart (2)
		
		Card c3 = new Card("Club","J");
		System.out.println(c3);
	}
	
//	println 오버로딩!
//	파라미터에 입력된 대상의 타입이 명확하게 String이면 str만 출력되지만
//	파라미터에 입력된 대상의 타입이 string이 아닌 경우 obj가 먼저 출력된다!
//	즉, 어떤 것을 입력하건 종국에는 str을 출력한다!!
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void println(Object obj) {
		System.out.println("obj!");
		String str = obj.toString();
		println(obj.toString());
	}

}
