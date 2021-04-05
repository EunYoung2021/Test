package ch5;

import java.util.Scanner;

public class MethodMission_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String[]menuNmArr = {"콜라","사이다","환타", "스프라이트","망고주스", "포도주스"};
		int[] menuPriceArr = {1000,2000,3000, 1500, 2000, 3000};
		
		printMenu(menuNmArr, menuPriceArr);
		
	}

	public static void printMenu(String[]strarr, int[]intarr) {
		System.out.println("< 메뉴 >");
		String menuNm = " ";
		int price = 0;
		for(int i = 0; i < strarr.length; i++) {
			menuNm = strarr[i];
			price = intarr[i];
			System.out.printf("%d. %s (%,d원)\n", i+1, menuNm, price);
		}
		}
//================================================================================강사님답	
	public static void printMenu_1(String[]nMArr, int[]priceArr) {
		System.out.println("< 메뉴 >");
		for(int i = 0; i < nMArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", i+1, nMArr[i], priceArr[i]);
		}
	}
	
	public static void printMenu_2(String[]nMArr, int[]priceArr) {
		String str = "< 메뉴 >\n";
		for(int i = 0; i < nMArr.length; i++) {
			str += String.format("%d. %s (%,d원)\n", i+1, nMArr[i],priceArr[i]);
		}
		System.out.println(str);
	}
}
