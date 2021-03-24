package sec06.ch03;

public class AssignmentOperatorExam {//(p. 93~97은 비트연산자 - 안 배움)
									 //p.98 - 
public static void main(String[] args) {
	// 대입연산자
	int n1 = 0;
	n1 = n1 + 5;
	System.out.println("n1 : "+ n1);//5
	
	int n2 = n1 + 10;
	System.out.println("n2 : "+ n2);//15
//	System.out.println("n1 : "+ n1);//값이 바뀐 적이 없으므로 5가 나온다.
	
	n1 = 2;	//이 때 n1값이 바뀌므로 위에 "n1 : "+n1의 값은 바뀌지 않는다.
	
	int n3 = 0;
	n3 = n3 + 5;
	System.out.println("n3 : "+n3);
	
	int n4 = 0;
	n4 += 5;//★ 반복문에서 자주 쓰임
	System.out.println("n4 : "+n4);
	
	int n5 = 10;
	System.out.println("n5 : "+ n5);
	//여기에 마이너스 복합식을 (대입연산자를)사용하여 4를 빼주세요. 
	n5 -= 4;
	System.out.println("n5 - 4 : "+n5);
	
//	p.102 확인문제
//	3번
	int score = 85;
	String result = (!(score>90))? "가":"나";
	System.out.println(result);
	
//	4번
	int pencils = 534;
	int students =30;
	
	//학생 한 명이 가지는 연필 수 
	int pencilsPerStudent =( pencils / students );
	System.out.println("pencilsPerStudent : "+pencilsPerStudent);
	
	//남은 연필 수 
	int pencilsLeft = (pencils % students);
	System.out.println("pencilsLeft : "+pencilsLeft);
	
//	5번
//	십의 자리 이하를 버리는 코드 작성
//	변수 value의 값이 356이라면 300이 나올 수 있도록 산술 연산자만 이용할 것.
	int value = 356;
	System.out.println("내가 적은 답 : "+(value/100)*100);
	
//	풀이
	int result1 = value / 100;
	int result2 = result1 * 100;
//	또는
	System.out.println("=======풀이=======");
	System.out.println("result1 : "+result1);
	System.out.println("result2 : "+result2);
	System.out.println("=======다른 답=======");
	System.out.println("value - value % 100 : " + (value - value % 100));
	System.out.println();
	//퍼포먼스 측면에서 가장 좋은 코드!!(-연산자의 속도가 가장 빠르다!!!!)
	
//	6번
//	사다리꼴의 넓이를 구하라! (소수자리수가 나오도록 코드를 작성할 것)
	int Top = 5;
	int Bottom = 10;
	int height = 7;
	double area = ((Top + Bottom)*height)/2.0;
	System.out.println("area : "+area);
	
//	8번
	double x = 5.0;
	double y = 0.0;
	
	double z = x % y;
	
	if(z != 0)
		System.out.println("0.0으로 나눌 수 없습니다.");
	else {
		double result_8 = z + 10;
		System.out.println("결과 = "+result_8);
	}
}
}
