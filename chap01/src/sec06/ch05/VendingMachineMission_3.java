package ch5;

import java.util.Scanner;

public class VendingMachineMission_3 {

	public static void main(String[] args) {
		/*
		 돈을 주입해주세요 : 3000
		 <메뉴>
		 1. 콜라 (1,000원)
		 2. 사이다 (1,200원)
		 3. 환타 (1,300원)
		 
		 ↓
		 
		 <메뉴>
		 0. 종료
		 1. 콜라 (1,000원)
		 2. 사이다 (1,200원)
		 3. 환타 (1,300원)
		 선택> 1
		 콜라를 선택하셨습니다.
		 남은 금액 2,000원
		 
		 <메뉴>
		 0. 종료
		 1. 콜라 (1,000원)
		 2. 사이다 (1,200원)
		 3. 환타 (1,300원)
		 선택> 3
		 환타를 선택하셨습니다.
		 남은 금액 700원
		 
		 <메뉴>
		 0. 종료
		 1. 콜라 (1,000원)
		 2. 사이다 (1,200원)
		 3. 환타 (1,300원)
		 선택> 2
		 금액이 부족합니다.
		 남은 금액 700원
		 
		 <메뉴>
		 0. 종료
		 1. 콜라 (1,000원)
		 2. 사이다 (1,200원)
		 3. 환타 (1,300원)
		 선택> 0
		남은 금액 : 700원 ← 여기까지!
		 */
		String[] menuArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 2000, 3000, 1500, 2000, 3000 };
		int choice = 0;
		String menu = null;
		int input_money = 0;
		
		System.out.printf("돈을 주입해주세요 >> ");
		Scanner sc2 = new Scanner(System.in);
		input_money = sc2.nextInt();
//		System.out.println("<메뉴>");
//		for (int i = 0; i < menuPriceArr.length; i++) {
//			System.out.printf("%d. %s (%,d)원\n", (i + 1), menuArr[i], menuPriceArr[i]);
//		}

		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("<메뉴>");
		for(int i = 0; i < menuPriceArr.length; i++) {
			System.out.printf("%d. %s (%,d)원\n",(i+1),menuArr[i],menuPriceArr[i]);
		}
		while (true) {

			System.out.printf("메뉴를 선택해주세요 >>");

			Scanner sc4 = new Scanner(System.in);
			choice = sc4.nextInt();
//			int selectedIdx = choice - 1;
			if (choice == 0) {
				break;

			} else if (choice >= 1 && choice <= menuArr.length) {
				if (input_money < menuPriceArr[choice-1]) {
					System.out.println("금액이 부족합니다.");
					continue;
				}
				System.out.printf("%s를 선택하셨습니다.", menuArr[choice - 1]);
				input_money -= menuPriceArr[choice-1];
				System.out.printf("(남은 금액 : %,d원)\n", input_money);
			} else {
				System.out.println("잘못선택하셨습니다.");
			}
		}
		System.out.printf("종료 - 남은 금액 : %,d원", input_money);

		sc3.close();

	
	
	
	}

}



