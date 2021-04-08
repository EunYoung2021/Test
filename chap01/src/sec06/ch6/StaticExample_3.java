package ch6;

public class StaticExample_3 {

	public static void main(String[] args) {
//		static 있/없메소드의 사용방법 구분!
		
//		※ 메모리에 올려서 사용해야함 이것을 객체화라고 말한다.
//		우리가 사용해왔던 방식 - 객체화를 시켜 메모리에 올려서 사용한다!
		CalcInstance ci = new CalcInstance();
		int result = ci.sum(10, 20);
		System.out.println("result : "+result);
	
	
//		static이 붙은 메소드의 경우에는 실행 시 이미 메모리에 올라가 있기 때문에 객체화가 필요없다. - 클래스명.메소드명(아규먼트);
//		어떨 때 쓰는거져, 
		int result2 = CalcStatic.sum(10, 30);
		System.out.println("result2 : "+result2);
		
//		요즘엔 사용하는 것을 권장함 (가능한 사용할 수록 사용해라)- 메모리도 넘쳐나고, 속도가 빠르기 때문
//		예외(절.대. 사용하지 말아야하는 경우)를 알아둘 것 -> StaticExample_4 ㄱㄱ!!!
		
	}

}

class CalcStatic{	//static이 붙은 메소드
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance{//static이 붙지 않은 메소드
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}