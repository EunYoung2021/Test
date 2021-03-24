package sec06.ch03;

public class OperatorExam_2 {//p.70 - 71
	public static void main(String[] args) {
		//증감연산자
		int n1 = 10;
		System.out.println("n1 : "+n1);
		n1++;n1++;
		System.out.println("n1 : "+n1);
		++n1;
		System.out.println("n1 : "+n1);
		--n1;
		System.out.println("n1 : "+n1);
		n1--;
		System.out.println("n1 : "+n1);
		
		System.out.println("===================================");
		
		int n2 = 10;
		int result = 10+(++n2);
		System.out.println("n2 result : "+result); //n2 result : 21 -> 10 + (11) = 21
		System.out.println("n2 : "+n2); 			//n2 : 11
		
		int n3 = 10;
		int result2 = 10 + (n3++);
		System.out.println("n3 result : "+result2); //n2 result : 20 -> 10 + (10) = 20
		System.out.println("n3 : "+n3); 			//n2 : 11
		
		
		System.out.println("===================================");
		
		//논리 부정 연산자 (!) : 값을 뒤집는 연산자 true -> false, false -> true.
		boolean result3 = 10 > 2;
		System.out.println("result3: "+result3); //true
		System.out.println("result3: "+!result3);//false
		
		boolean result4 = !(10 > 2); //false
		System.out.println("result4 : "+ !!!result4);//true
		
		
		
		
	}
}
