package ch6;

public class StaticExample {
//서태틱!!!
	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new  Toy();
		
		t1.name = "디즈니";
		System.out.println("t1.name : " + t1.name); //t1.name : 디즈니
		
		t2.name = "롯데";
		System.out.println("t2.name : "+t2.name); //t2.name : 롯데
		System.out.println("t1.name : " + t1.name);//t1.name : 롯데		띠용..
		
		System.out.println("Toy.name : "+Toy.name);//Toy.name : 롯데		띠용용..

	}
	

}


class Toy{
	static String name; //스태틱이 붙으면 객체와 상관없이 한 개만 존재한다. (메모리 상 완전히 다른 곳에 할당이 되며 공용으로 사용된다 =객체에서 주소를 통해 접근하건 클래스 명으로 접근을 하건 모든 곳에서 접근이 가능하며, 하나의 값만 저장이 가능하다.)
						//스태틱은 객체생성과는 무관하게 생성시 바로 메모리에 정해진 자료형에 따라 공간이 할당된다.
}