package ch5;
//기발한 아이디어!! 퍼포먼스적으로도 좋음!!
public class MethodMission_3_1 {

	public static void main(String[] args) {
		sumAllFromTo(2, 4); //sum : 9
		sumAllFromTo(4, 2); //sum : 9
	}
	
	public static void sumAllFromTo(int to, int from) {
		int sum = 0;
		
		for(int i = to; i <= from; i++) {
			sum += i;
		}
		
		for(int i = to; i >= from; i--) {
			sum += i;
		}
		System.out.println("sum : "+sum);
	}

}
