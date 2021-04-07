package ch6;
//접근 지시어 접근 제한자(p.256)
import ch6.acc.Access2;
public class AccessExample {

	public static void main(String[] args) {
//		- 종류 : private default protected public
//		class     O		  O			O		O
//		패키지	  X		  O			O		O
//		상속관계	  X		  X			O		O
//		전체		  X		  X			O		O

//	POINT! 캡슐화, public
	
	Access acc = new Access();
	acc.printNum();
	
	Access2 acc2 = new Access2();//Access2에 public이 붙어있기 때문에 import하면 바로 호출이 가능하다.
		
	}

}


class Access{			//여기서 public 접근제어자를 붙이면 다른 패키지에서도 접근이 가능하다. 
	private int num;
	void printNum() {	//여기서 private 접근제어자를 붙이면 여기서 뿐만아니라 AccessExampl_2에서도 접근이 불가능하다.
		System.out.println("num : "+num);
	}
}

//public은 같은 파일 명만 붙일 수 있다.