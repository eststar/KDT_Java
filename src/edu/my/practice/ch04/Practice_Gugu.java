package edu.my.practice.ch04;

public class Practice_Gugu {

	// 구구단을 세로로 순서대로 출력하는 메소드

	public static void printVertical() {

		int result = 0;

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				result = i * j;

				System.out.println(i + " * " + j + " = " + result);

			}
			System.out.println("end \n");
			System.out.println("-".repeat(20));
		}

	}

	//구구단 가로로
	public static void printHorizontal() {

		int result = 0;

		for (int i = 0; i < 10; i++) {
			
			for (int j = 2; j < 10; j++) {
				
				if (i == 0) {
					System.out.print(j + "단" + "\t\t");
					continue;
				}
				
				result = j * i;
				System.out.print(j + " * " + i + " = " + result + "\t");
			}
			System.out.println();
		}

		System.out.println("end");
		System.out.println("-".repeat(20));

	}

	//구구단 출력 열 입력 받아서 입력받은 숫자 만큼의 열을 가지는 행렬의 형태로 구구단 출력하는 함수
	//ex) 3 입력		2단	3단	4단
	//				5단	6단	7단
	//				8단	9단
	
	public static void printColumn(int col) {
		
		int result = 0;
		
		//전달받은 열에 따라 행의 개수 결정. Math 클래스 사용가능


		//각 단은 1~9까지 세로로 출력, 한 행에 입력받은 열의 수 만큼의 단 출력
		//1~9까지 출력후 한줄 바꿔서 다시 다음 단부터 입력받은 열의 수 만큼의 다음 단 출력
		//9단까지 출력후에는 출력 중단
		//각 단 시작 윗줄에 몇단인지 출력
		
		
	}
	
	public static void main(String[] args) {
//		printVertical();
//		printHorizontal();

		printColumn(3);
		printColumn(4);
	}
}
