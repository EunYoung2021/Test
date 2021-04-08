package ch6;

public class OverrideExample {

	public static void main(String[] args) {
		NumBox nb1 = new NumBox(10);
		NumBox nb2 = new NumBox(10);
	
		System.out.println("nb1 == nb2 : "+(nb1 == nb2));//주소값비교!(레퍼런스비교는 무조건 주소값비교!)
		System.out.println("nb1.equals(nb2) : "+nb1.equals(nb2));
		//위 결과 값이 true가 나오도록 오버라이딩!
		//원래 equals 안에는 주소값을 비교하는 == 이 있지만 그 안에 문자열로 오버라이딩하여 문자열을 비교하도록 되어있다.
		
	}

}

class NumBox{
	private int num;
	NumBox(int num){
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	
	@Override  //무엇을?? equals메소드를!!!
	public boolean equals(Object obj) {	//Object -- 오브젝트 타입은 모든 것의 주소값(정수값포함)을 정의할 수 있다.
		NumBox temp = (NumBox)obj;
		
		return this.getNum() == temp.getNum(); //같으면 true, 다르면 false
		
	}
	
	
}