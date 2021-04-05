package ch5;

import java.util.Arrays;

public class MethodMission_9 {

	public static void main(String[] args) {
		int[] arr = {4,8,10,11,45};
		
		System.out.println(Arrays.toString(arr));
		
		String result = toString(arr);
		System.out.println(result);
		// 4,8,10,11,45,
		
		System.out.println();
	}

	public static String toString (int[] arr) {
		String result = "[";
		for(int i = 0; i < arr.length-1; i++) {
			result += arr[i] + ", ";
		}
		result += arr[arr.length-1] + "]";
		
		return result; 
	}
//	주찬님은 천재야...... 복습, 예습하자ㅠㅜ
//==========================================================강사님 답
	public static String toString_1(int[] arr) {
		String str = " ";
		for(int i = 0; i < arr.length; i++) {
			if(i != 0){
				str += ", ";
			}
			str += arr[i];
		}
		return String.format("[%s]", str);
	}
}
