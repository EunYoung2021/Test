package ch5;

import java.util.Arrays;

public class SelectionSortExample {
public static void main(String[] args) {
	int[] arr = {8,7,3,1,6,0};
	
	for(int i = 0; i < arr.length; i++) {
		int minIdx = i;
		for(int z = i+1; z<arr.length; z++) {//항상 i보다 1칸 뒤에 있어야하기 때문에 i+1
			if(arr[minIdx] > arr[z]) {
				minIdx = z;
				System.out.println(Arrays.toString(arr));
			}
			System.out.println();
		}
		int temp = arr[minIdx];
		arr[minIdx] = arr[i];
		arr[i]=temp;
	}
}
}
