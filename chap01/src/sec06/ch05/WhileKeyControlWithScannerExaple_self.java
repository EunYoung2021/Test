package sec06.ch04;

import java.util.Scanner;

public class WhileKeyControlWithScannerExaple_self {

	public static void main(String[] args) {
		int speed = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------");
		System.out.println("1. 증속 | 2. 감속 | 3. 종료");
		System.out.println("-----------------------");
	
		while(true) {
			System.out.printf("선택 >> ");
			int inputSpeed = sc.nextInt();
			if(inputSpeed == 1) {
				speed++;
			} else if(inputSpeed == 2) {
				speed--;
			} else if(inputSpeed == 3) {
				speed = 0;
				break;
			} else {
				System.out.println("1 - 3 중에 선택해주세요.");
				continue;
			}
			if(speed < 0) {		//속도가 음수가 되면 강제로 종료!!
				System.out.println("역주행감지 - 강제 종료");
				break;
			}
			System.out.println("현재 속도 >> "+speed);
		}
		System.out.println("종료!");
	}

}
