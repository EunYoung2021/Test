package ch6;
public class PolymorExample {

	public static void main(String[] args) {
// 1. 부모타입의 변수는 자식객체를 가리킬 수 있다. 
// 2. 자식타입의 변수는 부모객체를 가리킬 수 없다.
// # 자신의 타입의 변수는 자신의 객체를 가리킬 수 있다. (당연하지만 난 굳이 적겠다 ㅇvㅇ)
// 3. 타입은 아는 메소드만 호출할 수 있다. 호출이 되었다면 기준(무슨 기준?? 생성??)은 객체(new ????에 있는 것, 타입에 따른것이 아님!!!)이다.
		Animal ani_1 = new Cat(); //1번예시
		//Cat cat1 = new Animal();//2번예시
		Cat cat = (Cat)ani_1;//빨간줄이 뜨지만 컴파일러가 ani_1를 Animal의 객체의 주소값이 아닌지, 즉 2번 예시가 아닌지를 의심하는 것
						//해결방법 ani_1; 앞에 (Cat)을 넣어주면 damn!
		
		//강제형 변환으로도 안되는 예시
//		Cat cat1 = (Cat)new Animal("ㅁ", 1);//ch6.Animal cannot be cast(형변환) to ch6.Cat에러 뜸
											//부모객체의 주소값은 자식타입의 객체에 복사,대입할 수 없다.
		ani_1.howling();					//야옹
//		ani_1.lick(); 						//이 타입으로는 호출이 불가능하다. 왜?? lick의 존재를 모르니까 ..뮁????
		cat.howling();						//야옹, 2번 예시..
		System.out.println("끝!");
		
		cat.printPet();							//3
	}

}
