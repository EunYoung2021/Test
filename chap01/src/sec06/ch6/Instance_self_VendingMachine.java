package ch6;

import java.util.Scanner;

public class Instance_self_VendingMachine {

	public static void main(String[] args) {

		Ey_VendingMachine e_vm = new Ey_VendingMachine();
		e_vm.sumMenu();
		e_vm.payment();
	}
}

class Ey_VendingMachine {
	
	int choice = 0;

	String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
	int[] menuPriceArr = { 1000, 2000, 3000, 1500, 2000, 3000 };

	public void sumMenu() {
		System.out.println("< 메 뉴 > SelfVendingMachine!\n");
		String str = "0. 종료\n";
		Drink[] drinkarr = new Drink[6];
		String choiceMenu = " ";

		for (int i = 0; i < drinkarr.length; i++) {
			drinkarr[i] = new Drink();
			drinkarr[i].nm = menuNmArr[i];
			drinkarr[i].price = menuPriceArr[i];
		}
		for (int i = 0; i < drinkarr.length; i++) {
			str += String.format("%d. %s ( %,d 원)\n", i + 1, drinkarr[i].nm, drinkarr[i].price);
		}
		System.out.println(str);

		while (true) {
			System.out.printf("===========================\n메뉴를 선택해주세요 >> ");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			if (choice < 0 || drinkarr.length < choice) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} else if (choice == 0) {
				break;
			} else {
				System.out.printf("선택하신 메뉴는 %s입니다.\n", menuNmArr[choice - 1]);
				continue;
			}

		}

	}

	public void payment() {
		for(int i = 0; i < menuNmArr.length; i++) {
			if(choice == 0) {
				
			}
		}
	}
}
