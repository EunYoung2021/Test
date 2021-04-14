package ch4;

public class IfExample_4 {

	public static void main(String[] args) {
		//삼항식
		
		System.out.println(abs(-10));
		System.out.println(abs(7));
		
		System.out.println(abs1(-1));
		System.out.println(abs1(1));
	}
	
	public static int abs(int val) {
		if(val < 0) {
			return -val;
		}
		return val;
	}
	
	public static int abs1(int val) {
		return val < 0? -val : val;
	}

}
