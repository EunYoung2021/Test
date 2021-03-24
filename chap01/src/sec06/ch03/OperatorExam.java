package sec06.ch03;

public class OperatorExam {
	public static void main(String[] args) {
		//산술연산자
		int n1 = 10;
		int n2 = 3;
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println((float)n1/n2);
//		왜 두 군데가 아니라 한군데에만 float을 줘도 되는 걸까???
//		>> int형과 float형의 계산 시 우선순위가 float이 되므로 다른 형(이 경우 int)에 float이 붙는다.
		System.out.println();
		float result = (float)n1 / n2;
		System.out.println("result : "+result);
		//=을 만나면 오른쪽부터 먼저 연산 -> so, n1/n2는 둘 다 int자료형이기 때문에 몫인 3밖에 남지 않으므로
		//result의 자료형이 float이라고 해서 3.3333이 나오는 것은 아니다.
		//result값을 float형으로 받기 위해서는 해당 식에 float을 붙여야한다.
		
		System.out.println("===================================");
		int result2 = 3 + 4 + 5 * 6;
		System.out.println("result2 : "+result2); // 37이지만
		int result3 = ((3 + 4)+5)*6;
		System.out.println("result3 : "+result3); //72, ()를 통해 우선순위를 변경하여 결과값에 영향을 미칠 수 있다.
		
		//나머지 값을 구하는 방법 (mod, %)
		int mod = 10 % 6;
		System.out.println("mod : "+mod);
		
		int odd = 3 % 2;
		int even = 4 % 2;
		System.out.println("odd : "+odd);
		System.out.println("even : "+even);
		
		System.out.println("===================================");
		
		//단항연산자 : 자주 쓰이진 않음
		int n3 = -2;
		System.out.println("n3 : "+ (-n3)); //2
		
	}
}
