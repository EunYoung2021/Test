package ch6;
//가변인자
public class VariadicArgumentsExample {
	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		
//		int result = cal.sum(10,20);
//		배열로도 받을 수 있음!!
		int result = cal.sum(new int[] {10,20});
		System.out.println("result : "+result);
		result = cal.sum(10,20, 30);
		System.out.println("result : "+result);
		result = cal.sum(10,20, 30,40);
		System.out.println("result : "+result);
		result = cal.sum(10,20, 30,40,50);
		System.out.println("result : "+result);
		
	}

}

class Calc2{
	int sum(int...vals) { //가변인자
		int sum = 0;
		for(int i = 0; i < vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}