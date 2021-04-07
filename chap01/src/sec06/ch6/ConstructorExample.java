package ch6;
//생성자
public class ConstructorExample {	
	public static void main(String[] args) {
		//객체 지향 언어는 모두 생성자를 사용한다.
		//생성자는 객체가 만들어질 때 무조건 호출을 해야한다.
		//생성자도 메소드 중 하나임
		Tv tv1 = new Tv();		//기본 생성자를 사용자가 작성하면 컴파일러가 자동으로 생성해주는 기본생성자가 없으므로, 사용자가 작성한 생성자의 @에 따라 작성해야한다.
		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 200;
		tv1.maxVolume = 100;
		tv1.currentVolume++; //ㅇ 이것과
		
		tv1.displayState();
		//Samsung 100inch 100Channel 100Volume
		
		Tv tv2 = new Tv("Lg",120,300,200);
		tv2.displayState();
		//Lg 200inch 150Channel 200Volume
	}
}

class Tv{
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	//기본 생성자
	//생성자 vs 메소드
	//1. 생성자의 이름은 클래스명과 같아야한다.
	//2. 생성자는 return타입이 없다. 생성자이름 앞에 void나 int 같은 것이 없다. (대신 접근제어자, 파라미터는 넣을 수 있음)
	
	// 생성자는 객체를 생성할 때만 사용할 수 있다.
	
	// 기본생성자는 컴파일러가 생성자가 하나도 없을 시 넣어준다.
	Tv(){}
	
	
	Tv(String brand, int inch, int maxChannel, int maxVolume){
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
//		System.out.println("Tv 기본 생성자");
	}
	
	void volumeUp(){
		int currentVolume = 0;
		this.currentVolume++;//ㅇ 이것이 같은 역할을 한다. this는 나 자신의 변수를 의미한다. 위의 경우처럼 같은 이름의 지역변수와 전역변수가 존재하는 경우에는 전역변수가 this가 된다.0
	}
	
	void displayVolume() {
		System.out.printf("현재 볼륨 : %d\n", currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n", this.brand, this.inch, this.maxChannel, this.maxVolume);
	}
}

