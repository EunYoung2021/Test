package sec06.ch04;

public class LableLoopExampleMission {

	public static void main(String[] args) {
		// n1, n2,값이 8이 되면 모든 for종료
		// n1, n2값이 같아지면 n1값을 올린다.
		OUTER: for (int n1 = 1; n1 <= 9; n1++) {
			for (int n2 = 0; n2 <= 9; n2++) {
				if (n1 == n2) {
					if(n1 == 8 && n2 == 8) {
						break OUTER;
					}
					break;
				} 
//				else if (n1 == 8 && n2 == 8) { //else if가 아니라 if문을 썼었어야했나봄.
//					break OUTER;
//				}
				System.out.printf("%d%d\n", n1, n2);
			}
			System.out.println();
		}
		System.out.println("\n끝!");
	}

}


//======================================================기본틀
//OUTER:
//	for(int n1 =1, n1 <=9; n1++) {
//		for(int n2 = 0; n2 <= 9; n2++) {
//			System.out.println("%d%d\n", n1, n2);
//		}
//	}
//	System.out.println("끝!");
//======================================================강사님정답
//OUTER: for (int n1 = 1; n1 <= 9; n1++) {
//	for (int n2 = 0; n2 <= 9; n2++) {
//		if (n1 == n2 && n2 == 8) { break OUTER;}
//		else if(n1 == n2) {
//				System.out.println();
//				continue OUTER;//또는 break;
//			}
//		System.out.printf("%d%d\n",n1,n2);
//		} 
//		System.out.printf("----"); //continue OUTER였다면 이거 출력됨, break사용 시 출력 안됨.
//}
//System.out.println("\n끝!");