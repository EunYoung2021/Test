package ch5;

public class MethodMission_8 {

	public static void main(String[] args) {
		//구구단!!
//		gugudan(5);
		// 8 * 1 = 8
		// 8 * 2 = 16
		// ...
		// 8 * 9= 72
		
		gugudan(6,3);
		
	}
	
	public static void gugudan(int num) {
		System.out.printf("구구단 %d단 START!\n", num);
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	
	public static void gugudan(int num1, int num2) {
		if(num1 > num2) {
			int tmp = 0;
			tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		
		System.out.printf("구구단 %d - %d단 START!\n\n", num1, num2);
		for(int i = num1; i <= num2; i++) {
			gugudan(i);
			System.out.println("-------------");
		}

	}

}
