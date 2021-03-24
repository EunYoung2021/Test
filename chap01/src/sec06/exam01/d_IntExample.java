package sec06.exam01;
/*
 정수 모두 정리
*/
public class d_IntExample {
	public static void main(String[] args) {
		char c = 'a';	//문자하나만 저장가능, 실제적으로 저장되는 값은 정수임.
		
		
		byte b =10;		//5mL
		short s = 20;	//1L
		int i = 30;		//4L
		long l = 40;	//8L
		
		//형변환 - 자동형변환
		s = b; //작은 것에서 큰 것으로 옮기므로 문제x - 자동 형변환
		
		s = (short)i; //s = i;만 적으면 에러가 남(자동형변환이 일어나지 않음)		=>		앞에 short를 붙여 수동적으로 자료형을 변환시켜준다.	(강제형변환)
					  //문제가 될 경우에는 안 쓰거나 강제형변환을 통해 자료형을 변경한다.
		
		byte byteValue =10;
		float floatValue = 2.5f;
		double doublevalue=2.5;
		char charvalue='3';
		char charvlaue2='1';
		
		byte result = (byte)(byteValue+byteValue);
		char charresult = (char)(charvalue+charvalue);
		System.out.println(charresult);
		
		int charresult2 = charvlaue2+charvlaue2;
		System.out.println(charresult2);
		}
}
