package ch5;

import java.util.Arrays;

public class BubbleSortMission {

	public static void main(String[] args) {
		int[] arr = {8,7,3,1,6,0};
		
		//7,8,3,1,6
		//7,3,8,1,6
		//7,3,1,8,6
		//7,3,1,6,8
		
		//3,7,1,6,8
		//3,1,7,6,8
		//3,1,6,7,8
		
		//1,3,6,7,8
		
		
		for (int i = 1;i < arr.length; i++) { //int i = 0을 넣으면 한번 더 돌게 되므로 퍼포먼스 측면에서 좋지 못함!@!
			for (int j = 0; j < arr.length-1-i; j++) {	//j < arr.length-1-i 를 해주는 이유는 -i를 해주면 앞에서 비교했던 값은 비교하지 않기 때문이
				if (arr[j+1] <= arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
					System.out.println(Arrays.toString(arr));
				}
			}
			System.out.println();
		}
	}

}


//[7, 8, 3, 1, 6, 0]
//[7, 3, 8, 1, 6, 0]
//[7, 3, 1, 8, 6, 0]
//[7, 3, 1, 6, 8, 0]
//[7, 3, 1, 6, 0, 8]
//
//[3, 7, 1, 6, 0, 8]
//[3, 1, 7, 6, 0, 8]
//[3, 1, 6, 7, 0, 8]
//[3, 1, 6, 0, 7, 8]
//
//[1, 3, 6, 0, 7, 8]
//[1, 3, 0, 6, 7, 8]
//
//[1, 0, 3, 6, 7, 8]
//
//[0, 1, 3, 6, 7, 8]

