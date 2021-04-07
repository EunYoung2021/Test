package ch6;

public class InstanceExample_5 {

	public static void main(String[] args) {
		Car[] carArr = new Car[5];	// carArr는 Car타입의 5짜리 칸을 가진 배열의 주소값을 지니고 있다. 래퍼런스 타입으로 만들어진 배열의 각 칸에는 각 각 null로 채워져있다.
									// 레퍼런스변수 타입의 메서드는 무조건 '주소값'을 지닌다. ex> String toString()라는 메서드가 있고, 이걸 호출하면 String(타입의)객체의 주소값을 리턴한다.
		//만일
		carArr[0].name = "그랜저";//라고만 하면 안됨!
		
		System.out.println(carArr);//carArr 자체는 주소값을 지니고 있다. ( 배열이 시작되는 주소값 )
		System.out.println(carArr[0]);
		System.out.println(carArr[1]);
		System.out.println(carArr[2]);
		System.out.println(carArr[3]);
		
	}

}
