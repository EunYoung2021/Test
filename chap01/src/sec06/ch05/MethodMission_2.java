package ch5;

public class MethodMission_2 {

	public static void main(String[] args) {

		int n1 = 10, n2 = 3;
		double result = divide(n1,n2); 
		System.out.println("result : "+result);//3.333
		
		n2 = 5;
		result = divide(n1,n2); 
		System.out.println("result : "+result);//2.0
		
		
		//절댓값!
		System.out.println("절대값 : "+ abs(10));//10
		System.out.println("절대값 : "+ abs(-10));//10
		System.out.println("절대값 : "+ abs(7));//7
		System.out.println("절대값 : "+ abs(-7));//7
//=================================================================================================		
		//형태 파악
		//비 void형! -> 앞에 int가 있음! 별도로 출력하는 실행문이 있으므로
//=================================================================================================	
	}
	public static double divide(int d1, int d2) {
		if(d1 > d2) {
			return (double)d1/d2;//point d1, d2 중 하나만 double로 형변환해도 됨!(나머지는 자동형변환)
		}
		return (double)d2/d1;
		
	}
	
	public static int abs(int n1) {
		if(n1<0) {
			return -(n1);
		}
		return n1; //return Math.abs(n);
	}
}
