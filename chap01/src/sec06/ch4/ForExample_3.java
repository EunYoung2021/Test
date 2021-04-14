package ch4;

public class ForExample_3 {
//for - each문
//	for each는 "순서"가 있고 "주소값"을 가진 변수에만 사용 가능하다.

	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 10, 56};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("====================");
	
		for(int val : arr) { //arr에 값이 있는 동안 arr에 있는 요소를 순서대로 val에 대입
			System.out.println(val);
		}
	}
	

}
