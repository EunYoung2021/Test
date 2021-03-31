package ch05;

public class ArrayMission_2 {
	public static void main(String[] args) {
		// 정수형 배열 생성(10칸짜리)
		// 1-10값이 순차적으로 대입(for문사용)
		// 각 방의 값을 콘솔 출력 for
		// 입력과 출력은 분리 할 것

		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++) {
				intArr[i] = i+1;
		}
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.printf("intArr[%d] = %d\n",i,intArr[i]);
		}
		
	}

}
