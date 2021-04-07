package ch6;

public class OverloadingExample {

	public static void main(String[] args) {
		//Calc 객체화
		//sum메소드 호출 아규먼츠는 5,10
		Calc calc1 = new Calc();
		calc1.sum(5, 10);
		
		calc1.sum(5, 10, 11);
		
		calc1.sum(10, 20, "30");
	}

}

class Calc{
	void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	//같은 이름의 메서드를 여러개 생성할 때 '파라미터'를 기준으로 구분한다. (갯수, 타입)
	void sum(int n1, int n2, int n3) {
		
	}
	
	int sum(int d1, int d2, String d3) {
		System.out.println(d1+d2+d3);
		return 0;
	}
}