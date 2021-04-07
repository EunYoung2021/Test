package ch6;

public class ConstructorExample_2 {
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		//일렉트로 50inch 100channel 50volume
	}
}

class Tv2{
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	Tv2(){
		//생성자 내에서 다른 생성자 호출하기 (this)
		this("일렉트로", 50, 100, 50);			//this. 는 멤버 필드(읽기 쓰기), 멤버 메소드를 호출  +  this()는 무조건 생성자 호출!!
		
//		brand = "일렉트로";
//		inch = 50;
//		maxChannel = 100;
//		maxVolume = 50;
	}
	
	Tv2(String brand, int inch, int maxChannel, int maxVolume){
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