package sec06.exam01;

public class c_PrintExample {

	public static void main(String[] args) {
		//println : 자동 개행
		System.out.println("하하");
		System.out.println("호호");
		System.out.println();
		
		//print
		System.out.print("하하");
		System.out.print("호호");
		System.out.print("\n");
		System.out.print("하하\n");
		System.out.print("호호\n");
		
		//TODO : System.out.printf 나중에 설명 (타입 설명 후에!)	
		char bloodType = 'O';
		int age = 10;
		float weight = 30.4f;
		String name = "믱";
		
		// 제 이름은 홍길동이며, 나이는 10살이고, 혈액형은 O형, 몸무게는 30.4kg입니다.
		//하드코딩!!!
		System.out.println("제 이름은 홍길동이며, 나이는 14살이고, 혈액형은 O형, 몸무게는 30.4kg입니다.\n");
		
		//println
		System.out.println("println 예시");
		System.out.println("제 이름은 "+name+"이며, 나이는 "+age+"살이고, 혈액형은 "+bloodType+"형, 몸무게는 "+weight
				+ "kg입니다.\n");
		
		//printf
		System.out.println("printf 예시");
		System.out.printf("제 이름은 %s이며, 나이는 %2d살이고, 혈액형은 %c형, 몸무게는 %.1fkg입니다.\n\n",name,age,bloodType,weight);
		// %5d = 공간을 다섯칸을 차지함(문자포함) -> 빈공간은 2칸
		// %05d = 공간을 다섯칸 차지하되 빈 공간을 0으로 채움(5대신 두자리 수도 가능)
		// %.1f = 소수점 첫번째자리까지 표시
		// %010.2f = 공간을 열 칸 차지하되 빈 공간을 0으로 채움(실수값 . 모두 포함)
		
		char ch = 'c';
		System.out.printf("%d : %c", (byte)ch,ch);
	}

}
