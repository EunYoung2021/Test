package ch5;

public class MethodMission {

	public static void main(String[] args) {
//		1번문제
		whoIsbig(10,30);//콘솔에 30이 가장 큽니다.  
		
		whoIsbig(10,9);//콘솔에 10이 가장 큽니다.
		
		whoIsbig(11,25);//콘솔 25이 가장 큽니다.
		
//=================================================================================================		
		//형태 파악
		//void형! -> 앞에 int나 자료형이 별도로 붙는 것이 없고, print를 해주지 않아도 스스로 출력까지 했기 때문!
//=================================================================================================	
		
		
//		2번문제
		int big = getBigNum(10,30);
		System.out.println("big : "+big);//big : 30
		System.out.println("big : "+getBigNum(10,30));
		
		big = getBigNum(10,9);
		System.out.println("big : "+big);//big : 10
//=================================================================================================		
		//형태 파악
		//비void형 중 int형 -> 앞에 int나 자료형이 별도로 붙는 것이 없고, print를 해주지 않아도 스스로 출력까지 했기 때문!
//=================================================================================================	
		
	}
	public static void whoIsbig(int n1, int n2) { 
//		1-1번
//		System.out.println(n1 > n2? n1+"이 가장 큽니다.": n2+"이 가장 큽니다.");
		
//		1-2번
		int answer = n2;
		if(n1 > n2) {
			answer = n1;
		}
		System.out.printf("%d이 가장 큽니다.\n",answer);
		
//		매개변수가 더 많으면 어떻게 구분하는 거지..?
		
	}
	
	
//		2번
	public static int getBigNum(int n1, int n2) {
		int answer = n2; /*X*/
		if(n1 > n2) {
			answer = n1;/*return n1;*/
		}
		return answer;/*return n2;*/
	}
}
