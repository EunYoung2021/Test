package ch5;

import java.awt.peer.MenuPeer;
import java.util.Scanner;

public class VendingMachineMission_A {

	public static void main(String[] args) {

boolean run = true;
int insertMoney = 0;

String[] menuArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
int[] menuPriceArr = { 1000, 2000, 3000, 1500, 2000, 3000 };

System.out.printf("돈을 주입해주세요 >> ");
Scanner sc = new Scanner(System.in);
insertMoney = sc.nextInt();

for(int i = 0; i < menuArr.length; i++	) {
	System.out.printf("%d. %s (%,d원)\n",i+1, menuArr[i],menuPriceArr[i]);
}
System.out.println("----------------");
while(run) {
	System.out.printf("선택 > ");
	int choice = sc.nextInt();if(choice < 0 || choice > menuArr.length) {
		System.out.println("잘못 선택");
		continue;
	}
	int selectedIdx = choice-1;
	if(choice == 0) {
		run = false;
		System.out.println("종료");
	} else if(insertMoney < menuPriceArr[selectedIdx]) {
		System.out.println("금액이 부족합니다.");
	} else {
		System.out.printf("%s를선택하셨습니다.",menuArr[selectedIdx]);
		insertMoney -= menuPriceArr[selectedIdx];
	}
	System.out.printf("(남은 금액 : %,d)\n", insertMoney);
}
sc.close();
	}

}
