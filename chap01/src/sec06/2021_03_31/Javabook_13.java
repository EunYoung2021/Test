package sec06.ch04;
import java.util.Scanner;
public class Javabook_13 {

	public static void main(String[] args) {
		// 1번 조건문 : if문, switch문
		// 반복문 : for믄, while문, do-while문

		// 2번 2번 double형은 사용할 수 없다. 정수타입의 자료형은 다 됨!

		// 3번 (Exercise_03)
		// for문을 사용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
		// 배수ㅠ의 개수까지 출력해보기
//		int sum = 0;
//		int count = 0;
//		
//		for(int i = 1; i < 101; i++) {
//			if(i % 3 == 0) {
//				sum += i;
//				count++;
//			}
//		}
//		System.out.printf("1 - 100까지 3의 배수 총합>> %d\n", sum);
//		System.out.printf("1 - 100까지 3의 배수의 갯수 >> %d", count);

		// 4번 (Exercise_04)
		/*
		 * while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의
		 * 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은
		 * (1,4)(4,1)(2,3)(3,2)입니다.
		 * 
		 * # 눈값의 범위는 1-6으로 합시다.
		 * 
		 * (실행결과) (6,4) (3,6) (6,4) (3,2) 끝!
		 */

//		while (true) {
//			int num1 = (int) (Math.random() * 6) + 1;
//			int num2 = (int) (Math.random() * 6) + 1;
//
//			System.out.printf("(%d, %d)\n", num1, num2);
//
//			if ((num1 + num2) == 5) {
//				break;
//			}
//		}
//		System.out.println("끝!");

//=============================================================강사님답! 똑같다잉		
//		while(true) {
//			int val1 = (int)(Math.random()*6)+1;
//			int val2 = (int)(Math.random()*6)+1;
//			
//			System.out.printf("(%d, %d)\n", val1, val2);
//			if(val1+val2 == 5) {
//				break;
//			}
//		}
//		System.out.println("끝!");
		
		
		
		// 5번
		/*
		중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력해보세요.
		단, x와 y는 10이하의 자연수입니다. (x,y는 1~10사이의 값)
		
		[실행결과]
		(5,8)
		(10,4)
		*/
		
		
//		for(int num3 = 1; num3 <= 10; num3++) {
//			for(int num4 = 1; num4 <= 10; num4++) {
//				int x = num3*4;
//				int y = num4*5;
//				
//				if(x+y == 60) {
//					System.out.printf("(%d, %d)\n+", num3, num4);
//				}
				
//		(+) 다른 답
				
//		int sum = 0;
//		
//		for(int a = 1; a <= 10; a++) {
//			for(int b = 1; b <= 10; b++) {
//				sum = (a*4)+(b*5);
//				if(sum == 60) {
//				System.out.printf("(%d, %d)\n", a, b);}
		
		
//		(+) 강사님 답
//		for (int x = 1; x <= 10; x++) {
//			for (int y = 1; y <= 10; y++) {
//				if (4 * x + 5 * y == 60) {
//					System.out.printf("(%d, %d)\n", x, y);
//					break; // 퍼포먼스적으로 도움이 된다!
//				}
//		}
//	}
//			
		
		// 7번
		
		/*
		 while문과 scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.*/
		
		boolean run = true;
		
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;	// 금액을 저장하는 변수로 위치가 while문 안에 있으려면 while>if/else if문 내에 continue; 문이 없어야 한다. ※
		First:
		while(run) {
			//int balance = 0;  ※balance가 여기 있으면 if/elseif문 내에 continue문 때문에 balance가 다시 0으로 저장되기 때문이다!! 
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택 >>");
		
			
			int menu = scanner.nextInt();

			if(5 <= menu) {
				System.out.println("\n error : 1부터 4사이의 숫자를 입력해주세요.\n");
				continue;
			} else {
				if (menu == 1) {
				System.out.printf("예금액 입력 >> ");
					balance += scanner.nextInt();
					continue;
				}
				else if (menu == 2) {
					System.out.printf("출금액 입력 >> ");
					balance -= scanner.nextInt();
					if(balance < 0) {
						System.out.println("error : 잔고가 부족하여 거래가 종료됩니다. 다시 시작해주세요.");
						break First;
					}
					continue;
				}
				else if(menu == 3) {
					System.out.printf("\n현재 잔고 >> %d원\n",balance);
					continue;
				}
				else if(menu == 4) {
					break First;
				}
			}

//			switch(menu) {
//			case 1:{
//				System.out.printf("예금액 입력 >> ");
//				balance += scanner.nextInt();
//				break;
//				}
//			case 2:{
//				System.out.printf("출금액 입력 >> ");
//				balance -= scanner.nextInt();
//				if(balance < 0) {
//					System.out.println("error : 잔고가 부족하여 거래가 종료됩니다. 다시 시작해주세요.");
//				}
//				break;
//			}
//			case 3:
//			{
//				
//			}
//					
//			}
		}
		System.out.println("\n프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

	
