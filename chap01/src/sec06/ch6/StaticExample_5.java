package ch6;

public class StaticExample_5 {

	public static void main(String[] args) {
		//n1 = 10;
		//n2 = 20;
		//sum()메소드를 호출하여 결과값을 콘솔에 찍으시오.
		
		StaticExample_5 ex = new StaticExample_5();
		ex.n1 = 10;
		ex.n2 = 20;
		System.out.println("ex.sum : " + ex.sum());
//========================================================
		int s = ex.sum();
		System.out.println("s : "+s);
		
	}
	int n1;
	int n2;
	public int sum() {
		return n1+n2;
	}

	
	
	
}

/*
 main
 */