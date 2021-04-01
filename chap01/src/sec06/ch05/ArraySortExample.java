package ch5;

import java.util.Arrays;

//20210401
public class ArraySortExample {

	public static void main(String[] args) {
		int[] arr = {88,65,23,1,900,42,95};
		
		System.out.println(Arrays.toString(arr));
		//[출력결과][88, 65, 23, 1, 900, 42, 95]
		
		//1. 88과 65 순서 바꾸기 - 하노이탑의 원리, sort!
		int tmp = 0;
		
		tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		System.out.println(Arrays.toString(arr));
	}

}
