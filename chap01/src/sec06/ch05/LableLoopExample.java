package sec06.ch04;

public class LableLoopExample {

	public static void main(String[] args) {
		// 이중 for문
		OUTER: // label 레이블화
		for (int i = 0; i < 4; i++) {
			INNER: for (int z = 100; z < 105; z++) {
				System.out.printf("%d - %d \n", i, z);

				if (z == 102) {
					continue; // ==continue INNER;
//					continue OUTER; //OUTER로 이동
//					break; // 가장 가까이에 있는, 나를 감싸는 1차 부모(반복문)만 박살낼 수 있다. so, 2차for문은 102에서 멈추고 1차 for문은 3번 반복된다!
//					for문 전체를 부수고 싶을 때!! OUTER: INNER:라는 레이블링을 진행 한 뒤 break OUTER / INNER (이름은 마음대로!); 식으로 작성하여 지정하여 break 할 수 있다.
				}
			}
	System.out.println("ddddd");
		}

	}

}
