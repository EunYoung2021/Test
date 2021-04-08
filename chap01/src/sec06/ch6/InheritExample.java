package ch6;

public class InheritExample {
//상속!!
	public static void main(String[] args) {
		KoShort cat = new KoShort(null, 0);
		System.out.println();
		//결과
		//Animal 생성자
		//Cat 생성자
		//animal이 먼저 생성되는건 super();의 위치때문이 아니다!
		//super();은 무조건 상위에 존재해야함 (밑에 위치하는 경우 오류남!)

//		cat.name = "고양이";
//		cat.age = 4;
		cat.howling();
//		cat.lick();
		cat.printPet();
	}

}


class Animal{  //만일 상속받은게 없는 경우 컴파일러가 super을 자동으로 생성해주는가?? >> Yes, class Animal extends Object!! (Object = 최상위 객체!)
	
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		}
	public void printPet(){
		System.out.printf("내 애완동물의 이름은 %s이고, %d살입니다.",name,age);
	}
	
	void howling() {
		System.out.printf("운다.\n");
	}
}

class Cat extends Animal{	
	public Cat(String name, int age) {//★
		super("핑핑이", 10);//★ 상속받은 부모 클래스의 생성자여부가 중요함
		// 만일 Animal(){}의 기본 생성자가 없고, 
	}

	void lick() {
		System.out.printf("%s가 핥다.\n",name);
	}
	
	@Override	//가능하면 적어주는 버릇을 들일 것. , 이걸 적어주는 이유는 부모에게까지 올라가지 않고 여기서 사용하기 위해 사용(같은 이름의 메소드를 여러 개 만들 때 사용하는 것은 오버로딩)
	//오버라이드는 같은 이름의 같은 형식의 메소드를 내용만 바꿔서 사용하기 위해 활용된다.
	void howling() {//오타가 나면 바로 잡아쥼!
		System.out.println("야옹");
	}
}

class KoShort extends Cat{
	void pee() {							//Cat은 이 메소드를 사용할 수 없다. 존재자체를 모른다!
		System.out.printf("%s가 소변을 본다.\n", name);
	}
	public KoShort(String name, int age) {
		super(name	, age);
	}
}