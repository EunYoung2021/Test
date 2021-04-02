package ch5;

public class MethodMission_3 {

	public static void main(String[] args) {
//		int f = sumAllFromTo(5, 10); // 5+6+7+8+9+10의 결과값 출력  ex) sum : 45
//		System.out.printf("sum : %d\n", f);//result : 45
		sumAllFromTo(5,10);
		
//		f = sumAllFromTo(2, 4);
//		System.out.printf("sum : %d\n", f);//result : 9
		sumAllFromTo(2,4);
		
//		f = sumAllFromTo(1, 100);
//		System.out.printf("sum : %d\n", f);//result : 5050
		sumAllFromTo(1,100);
		
//		f = sumAllFromTo(4, 2);
//		System.out.printf("sum : %d\n", f);//result : 9
		sumAllFromTo(4,2);
	
//		f = sumAllFromTo(2, 2);
//		System.out.printf("sum : %d\n", f);//result : 2
		sumAllFromTo(2,2);
		
		
//================================================================void형식!!!!!!	
	}
	
//	public static int sumAllFromTo(int n1, int n2) {
//		int sum = 0;
//		for(int i = n1; i <= n2; i++) {
//			sum += i;
//		}
//		
//=================================================================
//while문도 되나..?? 됨.
//		while (true) {
//			sum += n1;
//			n1++;
//			if (n1 > n2) {
//				break;
//			}
//		}
//=================================================================
//만약 n1이 n2보다 큰 수라면!
//		if(n1 > n2) {
//			int tmp = 0;
//			tmp = n1;
//			n1 = n2;
//			n2 = tmp;
//		}
//		for(int i = n1; i <= n2; i++) {
//			sum += i;
//		}
//		return sum;
//	}
//==========================================정답==========================================	
	public static void sumAllFromTo(int n1, int n2) {//파라미터에 final을 붙이면 퍼포먼스를 개선하는데 좋음!but, 길어짐.....(파라미터를 받는 변수를 하나더 생성하는 등의 코드를 작성해야함ㅎ)
		int sum = 0;
		if(n1 > n2) {
			int tmp = 0;
			tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		for(int i = n1; i <= n2; i++) {
			sum += i;
		}
		System.out.println("sum : "+sum);
	}
}
