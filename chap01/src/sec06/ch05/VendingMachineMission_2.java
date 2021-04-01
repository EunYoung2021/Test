package ch5;

import java.util.Scanner;

public class VendingMachineMission_2 {

	public static void main(String[] args) {
		/*
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
		 
		 <메뉴>
		 0. 종료
		 1. 콜라 (1,000원)
		 2. 사이다 (1,200원)
		 3. 환타 (1,300원)
		 선택> 3
		 환타를 선택하셨습니다.
		 
		 <메뉴>
		 0. 종료
		 1. 콜라 (1,000원)
		 2. 사이다 (1,200원)
		 3. 환타 (1,300원)
		 선택> 0
		 종료 - 사용한 금액은 : 2,300원 ← 여기까지!
		 */
		String[]menuArr = {"콜라","사이다","환타", "스프라이트","망고주스"};
		int[] menuPriceArr = {1000,2000,3000, 1500, 2000};
		int choice = 0;
		String menu = null;
		int use_money = 0;
		int input_money = 0;
		
		System.out.println("<메뉴>");
		for(int i = 0; i < menuPriceArr.length; i++) {
			System.out.printf("%d. %s (%,d)원\n",(i+1),menuArr[i],menuPriceArr[i]);
		}
		
//		while (true) {
//			System.out.printf("메뉴를 선택해주세요 >>");
//			Scanner sc2 = new Scanner(System.in);
//			choice = sc2.nextInt();
//			
//			if (choice == 0) {
//				break;
//			} else if (choice >= 1 && choice <= menuArr.length) {
//				System.out.printf("%s를 선택하셨습니다.\n\n", menuArr[choice - 1]);
//				use_money += menuPriceArr[choice - 1];
//			} else {
//				System.out.println("잘못선택하셨습니다.\n");
//			}
//		}
//		System.out.printf("종료 - 총액 : %d원입니다.\n",use_money);
//		if(input_money < use_money) {
//		}
//		System.out.println("끝!");
				
		
//============================================================강사님's
		Scanner sc3 = new Scanner(System.in);
		while(true) {
			System.out.printf("선택 >");
			int choice_1 = sc3.nextInt();
			
			if(choice == 0) {
				break;
			} else if(choice < 0 || choice > menuArr.length) {
				System.out.println("잘못 선택하셨습니다.");
				continue;
			}
			int selectedIdx = choice -1;
			
			System.out.printf("%s를 선택하셨습니다.\n", menuArr[selectedIdx]);
		}
		System.out.printf("종료 - 사용한 금액 : %,d원",use_money);
		sc3.close();
	}

}
