package ch05;

public class ArrayMission_1 {

	public static void main(String[] args) {
		// 정수형 배열 생성( 10칸짜리 )
		// 모든 방에 정수값 20을 세팅해 주세요. (for문 활용하여)
		
		int[] intArr1 = new int[10];
		
		for(int i = 0; i < intArr1.length; i++) { //값을 넣는 for문과
			intArr1[i] = 20;
		}
		
		for(int i = 0; i < intArr1.length; i++) { //값을 출력하는 for문을 분리해서 작성하는 버릇을 들여라!! Why???
			System.out.printf("intArr1[%d] = %d\n", i,intArr1[i]);
			
			
			
//			(+) for 문을 통해 배열을 다룰 때 i의 범위지정 시 배열명.length를 사용하는 버릇을 들일 것.
//			(+) 
		}
	}

}
