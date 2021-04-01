package ch5;
import java.util.Scanner;
public class VendingMachineMission {

	public static void main(String[] args) {
		/*
		 아래는 콘솔에 출력해야 하는 내용입니다.
		 
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
		 선택> 4
		 잘못 선택하셨습니다.
		 
		 */
		
//		System.out.println("<메뉴>");
//		System.out.println("1. 콜라 (1,000원)\n2. 사이다 (1,200원)\n3. 환타 (1,300원)");
//		System.out.printf("메뉴를 선택해주세요 >>");
//		Scanner sc = new Scanner(System.in);
//		int choice = sc.nextInt();
//		String menu = null;
//		if(choice == 1) {
//			menu = "콜라";
//		} else if(choice == 2) {
//			menu = "사이다";
//		} else if(choice == 3) {
//			menu = "환타";
//		}
//		System.out.printf("선택하신 메뉴는 %s입니다.",menu);
		
		
		
		//배열사용
		String[]menuArr = {"콜라","사이다","환타", "스프라이트","망고주스"};
		int[] menuPriceArr = {1000,2000,3000, 1500, 2000};
		int choice = 0;
		String menu = null;
		
//		System.out.println("=================================");
//		System.out.println("<메뉴>");
//		System.out.println("=================================");
//		for(int i = 0; i < menuPriceArr.length; i++) {
//			System.out.printf("%d. %s (%,d)원\n",(i+1),menuArr[i],menuPriceArr[i]);
//		}
//		System.out.println("=================================");
//		System.out.printf("메뉴를 선택해주세요 >>");
//		
//		Scanner sc = new Scanner(System.in);
//		choice = sc.nextInt();
		
//		while (true) {
//			for (int i = 0; i < menuArr.length; i++) {
//				if (choice == i) {
//					menu = menuArr[i - 1] + "를";
//				} else if (menuArr.length < choice) {
//					menu = "잘못";
//				}
//				System.out.printf("%s 선택하셨습니다.\n", menu);
////				break;
//			}
//		}
		
//========================================================================================강사님's
		
		while (true) {
			System.out.println("=================================");
			System.out.println("<메뉴>");
			System.out.println("=================================");
			for(int i = 0; i < menuPriceArr.length; i++) {
				System.out.printf("%d. %s (%,d)원\n",(i+1),menuArr[i],menuPriceArr[i]);
			}
			System.out.println("=================================");
			System.out.printf("메뉴를 선택해주세요 >>");
			
			Scanner sc2 = new Scanner(System.in);
			choice = sc2.nextInt();
				if (choice == 0) {
					break;
				}else if(choice >= 1 && choice <= menuArr.length) {
					System.out.printf("%s를 선택하셨습니다.\n",menuArr[choice-1]);
				} else {
					System.out.println("잘못선택하셨습니다.");
				}
				}
		System.out.println("끝!");
		
			
		

		
	}

}
