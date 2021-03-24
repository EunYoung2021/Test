package sec06.ch03;

public class CompareOperatorExam { //p.87 - 

	public static void main(String[] args) {
		//비교 연산자
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);	//num1이 num2보다 작거나 같은지
		boolean result4 = (num1 < num2);
		
		System.out.println("result1 = "+result1); //true
		System.out.println("result2 = "+result2); //false
		System.out.println("result3 = "+result3); //true
		System.out.println("result4 = "+result4); //false
		
		System.out.println("===================================");
		
		char ch1 = 'A';//아스키코드 : 65
		char ch2 = 'B';//아스키코드 : 97
		boolean result5 = ch1 < ch2; //65 < 97
		System.out.println("result5 = "+result5); //true
		System.out.println('A' == 65); //true
		System.out.println(0.1 == 0.1f);//false >> flaot은 근사치로 계산이 되므로 같지 않음
		System.out.println("3.5 == 3.5f : "+(3.5 == 3.5f)); //true
		System.out.println("3.2 == 3.2f : "+(3.2 == 3.2f));
		System.out.println(Double.compare((3.2),(3.2f))); // 1 = false 같지 않음
		System.out.println("(float)3.2 == 3.2f : "+((float)3.2 == 3.2f)); //true, double과 float을 비교 할 땐 double을 float으로 변환 한 뒤 비교해야한다.
		
		// <, >, >=, <=, ==, != 원시형 숫자타입( include char ) 나머지 타입에는 사용x
		String str1 = "A";//new String ("A");
		String str2 = "A";//str1;
		
		System.out.println("str1 == str2 : "+(str1 == str2)); //str1 == str2 : true
		//String의 ==비교 경우 true가 뜨긴 하지만 ==비교는 하지 말것 => 문자형은 equals를 사용할 것!
		System.out.println("str1.equals(str2) : "+ str1.equals(str2));
	}

}
