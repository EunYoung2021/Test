package ch05;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// 배열 (같은 타입의 변수를 여러 개 사용하기 편하기 위해 사용하는 것)
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		
			// 배열 문법 ( 변수타입[] 배열의 이름 = new 변수타입[몇 칸을 만들지];☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
//			int [] intArr = new int[50000]; //5만 개를 저장할 수 있는 배열 생성!
			
			int [] intArr = new int[10];
			intArr[0]=11;
			intArr[1]=12;
			intArr[9]=13;
			intArr[3]=intArr[9]+4; //17
			System.out.printf("%d\n\n",intArr[0]);
			
//			boolean[] boolArr = new boolean[500]; //거의 사용되지 않음.
//			String[] strArr = new String[500];
			
			//변수 2가지로 크게 분류(원시형-primitive Type : 소문자로 생성, 참조형-Reference Type : 대문자로 생성되는 것!)☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
			//참조형 타입의 배열은 각 방에 default로 null 또는 0 이 들어가 있다.
			
			//참조형-문자형 타입의 배열의 경우 - null이 default값이다.
			String[] strArr = new String[5];
			System.out.println("strArr[1] >> "+strArr[1]);
			System.out.println("strArr[2] >> "+strArr[2]);
			System.out.println("strArr[2] >> "+strArr[3]);
			
			//참조형-숫자형 타입(int의 경우 []이 붙으므로 원시형이 아닌 참조형이된다!)의 배열의 경우 - 0이 default값이다.
			int[] intArr_1 = new int[5];
			System.out.println("intArr_1[1] >> "+intArr_1[1]);
			
			
			//배열의 칸수[]에 변수를 넣어서 생성하는 것도 가능하다.
			int num1 = 3;
			int[] numArr = new int[num1];
			System.out.println("numArr의 length >> "+numArr.length);
			System.out.println("\n\n");
			
//			(+)레퍼런스 변수는 값이 아닌 그 위치의 주소값을 저장한다.
//			    일반변수는 레터럴 값을 저장한다.
			
//			(+) 일반변수는 뒤에 .을 붙이면 오류가 뜨지만
//				레퍼런스 변수는 뒤에 .을 붙이면 관련한 기능들이 나열된다. ex) numArr.length();
//==========================================================================================================================================			
			
			//배열의 값을 직접 입력하는 경우
			int[] intArr_2 = {10,20,30}; 
			
			for(int i = 0; i < 3; i++) {
				System.out.printf("intArr_2[%d] : %d\n", i, intArr_2[i]);
			}
			
			
	}

}
