package ch6;

public class InstanceExample_4 {
	public static void main(String[] args) {
		
		//Car 객체화 2개
		//첫번째 차 name = 소나타, cc는 2000
		//두번째 차 name = 911, cc는 5000
		//첫번째 차량 drive한다.
		//두번째 차량 stop한다.
		
		
		Car car1 = new Car();
		car1.name = "소나타";
		car1.cc = 2000;
		car1.drive();
		car1.stop();
		
		System.out.println("car1 : "+car1); //주소값출력
		
		Car car2 = new Car();
		car2.name = "911";
		car2.cc = 5000;
		car2.drive();
		car2.stop();
		
		System.out.println("car2 : "+car2);//주소값출력
		
		System.out.println(car1 == car2);//false : 두 객체가 같은 곳을 가리키는 주소값을 가졌다면 true
		
		//만약
		car1 = car2; //했다면 car1에 'car2이 갖고 있는 주소값을 복사하여 대입'하기 때문에 둘은 같은 주소값을 지니게 되므로
		System.out.println(car1 == car2);//true가 된다.
	}
}

class Car{
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s는 달린다.\n",name);
	}
	
	void stop() {
		System.out.printf("%s는 멈춘다.\n",name);
	}
}