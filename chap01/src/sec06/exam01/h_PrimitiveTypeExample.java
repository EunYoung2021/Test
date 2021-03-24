package sec06.exam01;

public class h_PrimitiveTypeExample {
	public static void main(String[] args) {
	//원시타입 (Primitive Type) VS 참조타입(Reference Type)
		//Primitive Type - 총 8개 (소문자로 시작하는 타입은 모두 원시타입의 자료형에 해당한다.)
		//byte, short, int, long(정수)
		//float, double (정수&실수)
		//char (문자형)
		//boolean
		
		//크기
		//byte(1byte) < short(2byte)< int(4byte) < long(8byte) < float(4byte)-(근삿값이지만)지수로 계산해서 저장하기 때문에 더 많은 값을 저장할 수 잇으므로 long보다 크다. < double(8byte)
		
		
		short sss1 = 10;
		long lll2 = 10;
		long result = lll2+sss1;	//long으로 변경해주어야함
		
		//오버플로우
		byte var1 = 127;//(min~max: -128~127);
		short var2 = 128;//(128~32767);
		var1 = (byte)var2;
		System.out.println("var1 : "+ var1); //-128 -> overflow!
		
		//언더플로우
		byte var3 = 0;
		short var4 = -129;
		var3 = (byte)var4;
		System.out.println("var3 : "+var3); //127 -> underflow!
		
		float var5 = 10.678f;
		int var6 = (int)var5;//강제형변환
		System.out.println("var6 : "+var6); //10 -> 소수점값이 모두 날아간다.(반올림x)
		// 원시타입은 리터럴값을 저장한다. int i = 10; 에서 10을 리터럴 값(현실에서는 상수라고 함,
		// 그 의미만 지니는 것, 10이면 10, 1이면 1)이라고 한다.
		
	}
}
