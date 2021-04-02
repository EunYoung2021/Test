package ch5;

public class MethodMission_4 {

	public static void main(String[] args) {
//		1번
//		int rNum = getRandomNum();
//		System.out.println("rNum : " + getRandomNum()/*또는 rNum*/);
		
	
//		2번
//		rNum = getRandomNum(20);//똑같은 이름의 메소드를 여러개 사용이 가능하다(파라미터로 구분)
//		System.out.printf("값1 : %d\n",rNum);
//		rNum = getRandomNum(5);
//		System.out.printf("값2 : %d\n",rNum);
		//max = 20이면 0 - 19까지 출력
		//max = 5이면 0 - 4 출력
		
		
//		3번
		int rNum = getRandomNum(5,10); //5 - 10중에 랜덤한 수
		System.out.printf("문제 3번 : %d\n", rNum);
		rNum = getRandomNum(10,20); //5 - 10중에 랜덤한 수
		System.out.printf("문제 3번 : %d\n", rNum);
	}
	
	
	
	
	
	
//		1번
//	public static int getRandomNum() {
//		int n = (int) (Math.random() * 10);
//		return n;
		//return (int)(Math.random() * 10);
//	}

	
//		2번 3번
	public static int getRandomNum(int min, int max) {
		
//		for(int i = 0; i < max; i++) {
//			System.out.printf("%d ", i);
//		}
//		System.out.println();
//		return max;
		
		return (int)((Math.random()*(max-min+1))+min);
	}
		
}

