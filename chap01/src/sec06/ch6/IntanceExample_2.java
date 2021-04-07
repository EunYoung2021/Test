package ch6;

public class IntanceExample_2 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = d1;		//
		
		d1.name = "뽀삐";
		d2.name = "돌쇠";
		
		d1.bark();	//돌쇠가 멍멍
		
		// Stack / Heap
		
		
	}

}
