package ch5;

public class MethodMission_5 {
	// 중복된 소스 최대한 제거!
	// 메소드는 재활용을 극대화 시켜야함!!
	public static void main(String[] args) {

		int star = 5;
		printStarTri(star);

		System.out.println();

		star = 6;
		printStarTri(star);

		
		star = 5;
		printStarTri2(star);
	}

	public static void printStarLine(int num) {
		for (int i = 0; i < num; i++) {
			System.out.printf("*");
		}
	}

	public static void printStarSquare(int num) {
		for (int i = 0; i < num; i++) {
			printStarLine(num);
			System.out.println("");
		}

	}
	
	public static void printStarTri(int num) {
		for (int i = 1; i <= num; i++) {
			printStarLine(i);				// Point! 스코프가 다르다! >> 메소드가 다르면 변수명이 같아도 다르게판단한다! 값을 전달받았을 뿐임!(단지 호출을 해서 값을 전달, 실행됐을 뿐임)
											// 호출 될 때 생성되었다가, 값을 보내주면 메모리에서 사라짐을 반복
			System.out.println();
		}

	}

	//응용 - 거꾸로 찍기!
	public static void printStarTri2(int num) {
		for (int i = num; i >= 0; i--) {
			printStarLine(i);
			System.out.println("");
		}
	}
	
	
	
}
