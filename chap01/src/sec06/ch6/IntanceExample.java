package ch6;

public class IntanceExample {

	public static void main(String[] args) {
		//com.naver.프로젝트명.model.클래스명 = 기본 패키지에는 적어도 .이 두 개 정도는 있어야 함(특히 앱에서는 필수!)
		
		//public은 자바파일명과 동일한 이름을 가진 클래스에만 붙일 수 있음!
		//클래스에는 프로토타입(자바스크립트에서 사용), 클래스(자바스크립트와 ??를 제외한 모든 언어가 차용함)타입이 있음
		
		// 객체는 멤버필드와 멤버메소드로 이루어져있다.
		// 멤버필드 : 값을 저장할 수 있는 것 - 명사 담당		ex - 키, 몸무게, 머리길이, 혈액형
		// 멤버메소드 : 값을 수정할 수 있는 것 - 동사 담당	ex - 뛰다, 자다, 말하다, 마시다
		// 절차지향언어만 사용하는데 한계가 느껴 그를 타파하기 위한 언어가 객체지향 언어이다.

		new Dog(); //으로도 객체화 할 수는 있지만 일회성임, 만들자마자 사라짐.(주소값을 저장하지 못함)
		
		Dog dog = new Dog();
//		dog는 new를 통해 Dog라는 클래스의 객체가 됨. = Dog의 위치값을 가지게 됨
//		static은 메모리에 자동으로 생성되는 명령어이다.
	
		
		Dog ddd = new Dog();
		ddd.name = "Snoopy";
		ddd.bark();
		
		
		Dog d2 = new Dog();
		d2.name = "돌쇠";
		d2.bark();
		
		//ddd 와 d2는 구조는 같으나 주소값이 다르다! = 각기 다른 객체라고 이해해야한다.
		// so, 각자 다른 값을 저장할 수 있다.
		
	}
}


class Dog{			//클래스명은 항상 대문자로 시작할 것!!
	String name;	//전역변수로 메소드 안에 소속되어 있지 않음, 멤버필드
	String jong;
	int age;
	
	void bark() {	//멤버메소드, public/static을 붙이지 않았음!!!!!!중요!!!!!!!
		System.out.printf("%s가 멍멍\n",name);
	}
	
}

