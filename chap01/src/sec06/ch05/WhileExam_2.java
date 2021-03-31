package sec06.ch04;

public class WhileExam_2 {

	public static void main(String[] args) {
		// break & continue문

//		int i = 0;
//		while (true) {
//			i++;
//			if (i == 4) {
//				break; // 반복문이 break;를 만나면 반복문 실행이 종료된다.
//			}
//			if(i % 2 == 0) {
//				continue;// 바로 while문으로 돌아감, 아래의 i :는 실행되지 않는다.
//			}
//			System.out.println("i : " + i++);
//		}
//		System.out.println("끝");
		
		
		for(int k = 0; k<10; k++) {
			
			if(k % 2 == 0) {
				continue;
			}
			System.out.println("k : "+k);
		}

	}

}
