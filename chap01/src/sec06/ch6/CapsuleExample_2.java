package ch6;

import ch6.CapsuleExample;

public class CapsuleExample_2 {

	public static void main(String[] args) {
		Human h1 = new Human();			//이름 : 미상, 나이 : 10
		h1.whoAmI();
		Human h2 = new Human("평강공주");	//이름 : 평강공주, 나이 : 10
		h2.whoAmI();
		Human h3 = new Human(30);		//이름 : 미상, 나이  : 30
		h3.whoAmI();
		Human h4 = new Human("이순신", 20);//이름 : 이순신, 나이  : 20
		h4.whoAmI();
	}
}                                                       