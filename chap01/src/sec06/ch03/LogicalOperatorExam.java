package sec06.ch03;

public class LogicalOperatorExam {//p.91 - 93
	public static void main(String[] args) {
		// 논리 연산자     (&&-and, ||-or, !-not)
		// &이나 |은 웬만하면 사용하지 않는것을 추천 be, 퍼포먼스가 좋지 못함
		boolean res1 = (1<7) && true &&false;
		System.out.println("res1 : " + res1); //false -> &&연산자는 모든 요소가 true이어야만 true가 나온다. 그래서 대부분이 false.(true나오기가 어려움)
		
		boolean res2 = (10 < 2) || false || true;
		System.out.println("res2 = "+res2); //true -> ||연산자는 개중에 하나만이라도 true이면 true가 나온다. &&와 반대로 대부분이 true.(false나오기가 어려움)
		
		System.out.println("res2 = "+!res2);//false
		
		
		//개꿀팁★★★★★
		boolean res3 = (1>7) && true && true;// 맨 앞 요건이 false인 경우 뒤 내용은 물어보지 않는다.
											// so, false가 나올 확률이 높은 요소를 맨 앞에 배치시킨다.
											// (튜닝!- 퍼포먼스 개선!)
		//Q
//		int n = 2;
//		boolean res = false && (1<n++);
//		에서 n++을 연산하나요?
//		A
//		연산하지 않음!
		int n = 2;
		boolean q1 = false && (1<n++);
		System.out.println("n : "+n); //n값이 변하지 않으므로 연산하지 않는다.
									  //||의 경우에는 연산한다!
		boolean q2 = (1<n++) && false;
		System.out.println("n : "+n); //3이므로 연산한다!
		
		boolean q3 = false || (1<n++);
		System.out.println("n : "+n); //4연산한다.

		}
}
