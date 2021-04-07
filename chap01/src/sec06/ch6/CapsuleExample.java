package ch6;

public class CapsuleExample {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.setAge(12);
		h1.setName("홍길동");
		System.out.println(h1.getAge());
		System.out.println(h1.getName());
		
		h2.setAge(20);
		h2.setName("신사임당");
		System.out.println(h2.getAge());
		System.out.println(h2.getName());
		
		
		//메소드를 통해서 안에 있던값 출력하기
		h1.whoAmI();	//내 이름은 홍길동 나이는 12살입니다.
		h2.whoAmI();	//내 이름은 신사임당 나이는 20살입니다.
		
		//클래스 외부에서 안에 있던 값 출력하기
		System.out.printf("My name is %s, age is %d.\n",h1.getName(),h1.getAge());
		System.out.printf("My name is %s, age is %d.",h2.getName(),h2.getAge());
	}

}

class Human{
	private int age;
	private String name;
	
	//메소드를 통해 private의 필드에 값을 넣을 수 있다.(★★★★★)  / 값을 빼내는 것은 메소드를 통해서만 가능하다.(★★★★★★★)
	
	//생성자를 통해서도 private의 필드에 값을 넣을 수 있지만 생성 당시에 사용 될 뿐 그 후에 활용하는데에는 적합하지 않다.(★★★★★)
	
	
	//setter,getter
	//네이밍 규칙 중요!! setter와 getter가 원칙임 + 변수명(대문자로 시작)
	//this를 붙이지 않으면 파라미터의 name을 변경하는 것과 다를바가 없다. = 메서드가 끝남과 동시에 사라져버림.
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n",this.name, this.age);
	}
	
	Human(){
//		this(10);
		age = 10;
	}
	
	Human(String name){
//		this(name,10);
		this.name = name;
		this.age = 10; 
	}
	
	Human(int age){
//		this("미상",age);
		this.name = "미상";
		this.age = age;
	}
	
	Human(String name, int age){
//		this(name,age);		여기서는 this()를 사용하면 안된다! 왜냐 얘가 그 자체이기때문에!!여기가 최종적으로 호출되는 생성자기때문에 여기서 name과 age값을 받아 저장하게 된다!
		this.name = name;
		this.age = age;
		
		
//		첫번째 Human이 두번째 Human을 호출, 두번째 Human이 네번째 Human을 호출!
//		그래서 첫번째 Human에 10을 넣어도 name에 미상이 나온다....는데 뭐라는거져는 이해했다!!!!!
	}
}