package ch5;

import java.util.Scanner;

public class MethodMission_7 {
	// 남자 평균키 : 175, 여자 평균키 : 163
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = "y";

		do {

			System.out.print("성별 : ");
			String gender = sc.next(); // 남, 여

			if (!gender.equals("남") && !gender.equals("여")) {
				System.out.println("남, 여 중에 입력해주세요.");
				continue;
				
			}

			System.out.print("키 : ");
			int height = sc.nextInt();

			String result = chk(gender, height);
			System.out.println(result);
			// 성별 : 남, 키:170cm, 평균 미만
			// 성별 : 여, 키:163cm, 평균

			// 로직을 구현할 부분

			System.out.print("계속하시겠습니까?? (y / n) >>");
			answer = sc.next();

		} while (answer.equals("y"));
		System.out.println("끝!");
		sc.close();
	}

	public static String chk(String gender, int height) {
		String result = "평균";
		if (gender.equals("남")) {
			if (height < 175) {
				result += "미만";
			} else if (height > 175) {
				result += "이상";
			}
		} else if (gender.equals("여")) {
			if (height < 163) {
				result += " 미만";
			} else if (height > 163) {
				result += " 이상";
			}
		}

		return "성별: " + gender + ", 키 : "+height+"cm " + result;
	}
//=============================================================================	
	public static String chk_1(String gender, int height) {
		int stand = 0;
		String result = "평균";
		
		switch(gender) {
		case"여":
			stand = 163;
			break;
		
		case"남":
			stand = 175;
			break;
		default:
			return"성별을 잘 못 입력하셨습니다.";
		}
		
		if(height > stand) {
			result = "평균 초과";
		} else if(height < stand) {
			result="평균 미만";
		}
		
		return String.format("성별 : %s, 키 : %dcn, %s", gender, height, result); //String.format!! 무적!!!!
//		return "성별: " + gender + ", 키 : "+height+"cm " + result;
	}
}
