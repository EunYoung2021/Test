package ch5;

public class MethodExample {

	public static void main(String[] args) { //메인메소드
//		int result = sum(10,20);
//		System.out.println("result : "+result);
		
//		int aaa = 10;
//		int result = sum(aaa,40); //변수를 넣어도 됨
//		System.out.println("result : "+result);
		
		
		int result_1 = minus(20,10);
		System.out.println("minus-result : "+result_1);
		}
	public static int sum(int n1, int n2/*선언부*/) {//메인메소드 안에 들어가면 안됨
		/*구현부*/return n1 + n2;
	}
	
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}

}
