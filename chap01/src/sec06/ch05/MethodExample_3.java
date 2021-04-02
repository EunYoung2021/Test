package ch5;

public class MethodExample_3 {

	public static void main(String[] args) {
		int mon = 10;
		printSeason(mon);
	}

	public static void printSeason(int mon) {
		switch (mon) {
		case 3: case 4: case 5:
			System.out.println("봄");
			return; //메소드는 return키워드를 만나야 무조건 종료가 된다.
		case 6: case 7: case 8:
			System.out.println("여름");
			return;
		case 9: case 10: case 11:
			System.out.println("가을");
			return;
		case 12: case 1: case 2:
			System.out.println("겨울");
			return;
		}
		System.out.println("잘못입력하셨습니다.");

	}
}
