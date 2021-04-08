package ch6;

public class StaticExample_4 {
//	static을 사용하지 말아야하는 경우(절.대. 사용하지 말아야하는 경우)
	public static void main(String[] args) {
		//CalcInstance2 객체화
		//num1 = 10, num2 = 20;
		//더한 값을 콘솔에 출력!
		
//==============================================내가 적은 답	
		CalcInstance2 cal1 = new CalcInstance2();
//		int num1 = cal1.setNum1(10);
//		int num2 = cal1.setNum2(20);
		int result = cal1.sum();
		System.out.println("result : "+result);
//==============================================강사님 답
		CalcInstance2 ci = new CalcInstance2();
		ci.num1 = 10;
		ci.num2 = 20;
		int result2 = ci.sum();

		String.format("%d",result);
		

		
		
		
//===============================================================================
		//CalcStatic2의 경우
		
		
		
	}

}
class CalcStatic2{	//static이 붙은 메소드 (클래스 멤버필드 - 사용 시 클래스만 있으면 되기 때문에 이렇게 칭하기도 함)
	static int num1;
	static int num2;
	
	static int sum() {	//멤버필드를 사용하고자 할 때는 사용하고자 하는 멤버필드에 static을 반드시 붙여야한다!
		return num1 + num2; //return this.num1 + this.num2도 사용이 가능하다
							// 객체화가 된 후에 메모리에 할당이 되므로 사용이 가능함!! but static이면 안됨!객체필요없이 바로 메모리에 올라가므로 this
	}
}





class CalcInstance2{//static이 붙지 않은 메소드 (인스턴스 멤버필드 - 객체가 필요하기 때문에 이렇게 칭하기도 함)
		int num1;
		int num2;
//============================================내가 적은 답		
		public int setNum1(int num1) {
			return this.num1 = num1;
		}
		
		public int setNum2(int num2) {
			return this.num2 = num2;
		}
//====================================================			
		int sum() {
		return this.num1 + this.num2;}
//===============================================언제 static을 붙일 수 있는지
		static int sum(int num1, int num2) {
			return num1+num2;
		}
	}


//static은 static끼리사용하고 인스턴스는 인스턴스끼리 사용할 수 있는것인가??
//순서는 다르지만 둘 다 메모리에 올라가서 
//static이 붙지 않은 멤버필드..뭐시깅???????
//메소드 앞에 static을 붙인다는 것은 명확한 구분이 가능한 것이라고 볼 수 있음 (대문자로 시작하는 놈.뭐시깅()하면 아 static이구나!하면됨) -> 속도 측면에서 굉장히 빠름!


//static이 붙지 않은 메소드는 무조건 객체화를 해야한다!
//파라미터로 들어온것만으로 메소드를 처리하는 경우(ex : sum)에는 static을 붙인다!
//스태틱이 붙지 않은 멤버필드(ex : CalcInstance2의 경우) 를 사용하는 메서드의 경우에는 static을 붙이면 안된다!


//main메소드의 경우 StaticExample_3에서 StaticExample_4의 내용을 호출할 수 있다!
//StaticExample_4를 가장 먼저 호출하면 StaticExample_4의 내용을 먼저 실행한 뒤에 StaticExample_3의 내용이 실행된다!