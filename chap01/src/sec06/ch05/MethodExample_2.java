package ch5;

public class MethodExample_2 {
//void형과 int형의 차이!
//	void는 return값이 없다(return하지 않겠다.)
// return 값은 저장이 되지만 출력까지 되는 것은 아니다.
//	void형이 default, 일만시키면 됨!! 비void형은 입,출력이 다 되는 메서드임(2차 가공이 가능하다).
	
	public static void main(String[] args) {
		System.out.println("voidSum");
		int n1 = 10, n2 = 30;
		voidSum(n1,n2);
		voidSum(1,2);
		//void형은 double a = voidSum(n1,n2);처럼 앞에 자료형을 적지 않는다!
		
		
		System.out.println("\nintSum");
		int result = intSum(n1,n2);
		System.out.printf("%d 더하기 %d는 %d입니다.\n", n1, n2, intSum(n1,n2));//intSum(n1,n2)처럼 출력문 안에 포함될 수도 있음.
		result = intSum(1,2);
		System.out.println("result_2 : " + result);

		//파라미터가 없는 메서드
		System.out.println("파라미터가 없는 메서드");
		for(int i = 0; i < 100; i++) {
			hello();
		}
	}
	
	public static void voidSum(int n1, int n2) {
		System.out.printf("%d + %d = %d\n",n1,n2, n1+n2);
	}
	
	public static int intSum(int n1, int n2) {
		return n1 + n2;
	}
	
	//파라미터가 없는 메서드
	public static void hello() {
		System.out.println("안녕하세여!!");
	}
}
