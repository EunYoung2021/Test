package ch4;

public class ForExample_4 {

	public static void main(String[] args) {
		String[] strArr = {"A", "B", "C", "D", "E","F", "G"};
		String[] strArr1 = new String[strArr.length];
		
		//DCBA로 출력하기!
		for(int i = strArr.length-1 ; 0 <= i; i--) {
			System.out.printf(strArr[i]);
		}
		System.out.println("====================================");
		//방법 두우번째!! 다른 배열을 생성해서 그걸 받아서 for-each문으로 출력하기
		
		for(int i = strArr.length-1; 0 <= i; i--) {
			for(int j = 0; j < strArr.length; j++) {
				strArr1[j] = strArr[i];
			}
		}
		
		for(String str : strArr1) {
			System.out.printf(str);
		}
		
	}

}
