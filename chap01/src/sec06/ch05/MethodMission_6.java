package ch5;

public class MethodMission_6 {

	public static void main(String[] args) {
		int score = getRandomScore(50,100);
		//50~100사이의 랜덤숫자가 나오도록 세팅!!
		
		char grade = getGrade(score);
		//90점 이상 'A'
		//80점 이상 'B'
		//70점 이상 'C'
		//60점 이상 'D'
		//나머지 'E'이 리턴되도록
		
		char grade2 = getGrade2(score);
		//?8이상 이거나 100점이면 '+'
		//?3 이하이면 '-'
		//나머지 ' ' 빈 칸이 리턴 되도록
		
		System.out.printf("%d : %c%c\n", score, grade, grade2);
	}
	
	public static int getRandomScore(int num1, int num2) {
		int result = (int)(Math.random()*(num2 - num1 + 1)+num1);	//point!! 랜덤값을 출력할 때 그 범위 지정 시 예를 들어 91을 곱하더라도 나오는 값은 90까지만 나온다!
																	//10부터 100까지 출력하고자 할 때=>.random()*91+10;을 하면 됨!(출력하고자 하는 최대값-출력하고자하는 최소값)+1?
		return result;
	}
	
	public static char getGrade(int result) {
		char grade = 'E';
		int numgrade = result / 10;
		
		if(numgrade >= 9) {
			grade = 'A';
		} else if(numgrade >= 8) {
			grade = 'B';
		} else if(numgrade >= 7) {
			grade = 'C';
		} else if(numgrade >= 6) {
			grade = 'D';
		}
		
		return grade;
	}
	
	public static char getGrade2(int getRandomScore) {
		char plma = ' ';
		int grade = getRandomScore % 10;
		
		if(grade >= 8 || getRandomScore == 100 ) {
			plma = '+';
		} else if(grade <= 3) {
			plma = '-';
		}
		
		return plma;
	}
}
