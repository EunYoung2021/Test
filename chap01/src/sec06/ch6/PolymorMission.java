package ch6;
public class PolymorMission {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
//		Lion lion = new Lion();

		cry(cat);	//야옹 출력				//= PolymorMission.cry(cat);
		cry(pig);	//꿀~ 꿀~ 출력			//= PolymorMission.cry(pig);
		cry(hamster);//찍! 찍! 출력		//= PolymorMission.cry(hamster);
		cry(new Lion());	//크앙!~
		
//파라미터에 왜 클래스명은 못들어감??????왜????? >> 클래스명만 작성했다면 타입만 작성한 것임 저 안에 클래스명을 사용하려면 cry(new Lion());을 넣으면 됨.
	}
	
	
//지은이거 뺏겨씀	
	static void cry(Animal species) {
		species.howling();
	}
//풀이 >> 왜 static을 붙일까?? >> 클래스 생성을 안하고 만들 수 있듬!!
//		파라미터의 타입에 왜 Animal을 넣었을까?? >> 공통적으로 Animal을 상속받은 클래스들이므로!
//										Animal을 상속받지 않은 클래스의 경우에는 cry를 사용할 수 없다! ex_Lion
//										Lion도 cry를 쓰려면 새로운 cry메소드를 만들어서 사용하거나 Lion도 Animal을 상속받고 override하면 됨ㅋ

// 만약 cry가 호출되지 않았다면 PolymorMission pm = new PolymorMission(); + pm.cry(cat/pig/hamster);!!
	
//==========================================================================
//	다형성의 개념이 없었다면??
	static void cry(Cat cat) {
		cat.howling();
	}
	static void cry(Pig pig) {
		pig.howling();
	}
	static void cry(Hamster hamster) {
		hamster.howling();
	}
//	이렇게 해결해야했음!
//==========================================================================

}

class Lion extends Animal{
	@Override
	void howling() {
		System.out.println("크앙!~");
	}
}

class Pig extends Animal{
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
		
	}
}

class Hamster extends Animal{
	//만약 howling을 오버라이딩하지 않았다면 부모클래스인 Animal로 올라가서 Animal의 howling을 출력한다.
	//Animal에도 howling이 없었다면 Object의 howling이 출력된다.
	@Override
	void howling() {
		System.out.println("찍! 찍!");
	}
}

