 package ch6;

public class InstanceExample_3 {

	public static void main(String[] args) {
		//일반변수와 레퍼런스변수의 큰 차이점 이해하기
		int mainnum = 10;		//일반변수 mainnum의 값 10 (리터럴값)
		
		Box box1 = new Box();	//box에 든 값은 주소값임 , 리터럴값X!!!
		box1.num = 10;		//Box 안에 int의 값 10
		
		changeNum(mainnum);	//mainnum의 값 10을 복사하여 파라미터에 대입
		System.out.println("mainnum : "+mainnum); //결과값 예측 : 10
		
		changeBoxNum(box1);
		System.out.println("box.num : "+box1.num); //결과값 예측 : 20 
	}	

	public static void changeNum(int num) {//단지 복사하여 준 값일 뿐이므로 여기서 받은 값은 그냥 복사된 값이므로 mainnum의 값은 변하지 않는다.
		num = 20;							//메소드가 끝나면 안에 있던 변수도 사라짐 > 고 투 가비지!
	}
	
	public static void changeBoxNum(Box box2) {//box의 주소값이 대입됨, Box box = new Box();에서의 Box box와 changeBoxNum의 (Box box)는 다른 변수임, 영역이 다름.
												//다만,  안에 갖는 값인 주소값은 동일하게 가진다!!
//		box2 = new Box();						//이게 들어가면 10으로 출력 Why?? 새로운 박스를 만들고 그 안에 다른 주소값을 넣음
		box2.num = 20;							//달라진 주소값에 위치한 값을 20으로 변경 >> 받아왔던 파라미터가 가지는 주소값에 위치한 값에는 변동이 없으므로 10이 출력됨.
	}
}
class Box{
	int num;
}


