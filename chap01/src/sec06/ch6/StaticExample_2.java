package ch6;

public class StaticExample_2 {

	public static void main(String[] args) {

		Toy2.makeCount = 10;
		Toy2 t1 = new Toy2(); //4. Toy2를 객체화하여 
		
		System.out.println("Toy2 : "+Toy2.makeCount); //2.하지만 외부에서는 클래스명.makeCount로 접근해야한다.
		System.out.println("Toy3 : " + Toy3.makeCount);
		//3. 
		
		//5. Toy3의 객체화를 통해 Toy2 : 10, Toy3 : 1을 찍고 싶을 때는
	}

}


class Toy2{
	static int makeCount;
	
	Toy2(){
		makeCount++;	//1. 같은 클래스 내에 있기 때문에 접근 시에 앞에 int나 static을 붙이지 않아도 된다.
		//6. Toy3.makeCount++; 방식으로 사용한다. 어떻게? 같은 클래스 내부에서는 가장 가까이 있는 같은 이름의 변수의 영향을 받으므로
		// 아예 앞에다가 적용시킬 클래스명을 적어서 해당 클래스의 객체를 만들어 호출 했을 때 해당 클래스에서의 makeCount 개수를 ++ 시킨다.
	}
}

class Toy3{
	static int makeCount;
}