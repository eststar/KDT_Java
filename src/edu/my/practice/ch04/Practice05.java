package edu.my.practice.ch04;


/*
 * 2차원 배열과 행렬 연산
 * 
 * 학습 목표
 *  1) 2차원 배열 만들기
 *  2) 난수로 배열 값 채우기
 *  3) 배열 간 덧셈, 곱셈, 전치(transpose) 개념 익히기
 *  4) 두 배열이 같은지 비교하기
 *  5) 배열을 테이블 형태로 출력하기
 *  
 *  구체적 설명:

1. 3줄 5칸짜리 표 A를 만든다.

	A[3][5]는 3명의 학생이 5과목 시험 본 점수표라고 생각하자.

	점수는 0~99 사이의 무작위 숫자로 채운다.

2. 같은 크기의 표 B도 만들어서 무작위 점수로 채운다.

3. C = A + B

	A와 B의 각 자리에 있는 값을 더해서 C라는 새로운 표를 만든다.

	예: C[0][0] = A[0][0] + B[0][0]

4. 5줄 4칸짜리 표 D를 만든다.

	D[5][4]는 예를 들어 과목별 프로젝트 점수라고 생각해보자.

5. E = A × D (행렬 곱셈)

	A(3x5)와 D(5x4)를 곱해서 E(3x4)라는 표를 만든다.

	E[i][j] = A[i][0]*D[0][j] + A[i][1]*D[1][j] + ... + A[i][4]*D[4][j]

6. 2차원 배열을 테이블 형태로 출력한다 

 */
public class Practice05 {
	public static void main(String[] args) {
		//랜덤 입력 위한 객체 생성
		

		// 3x5 행렬 표현 위한 2차원 배열 선언
		
		// 1., 2., 3.
		// 배열에 0~100(100은 제외) 사이의 정수 입력 및 배열 덧셈
		
		
		//4.
		//5x4 배열 생성 및 랜덤 값 입력
				
		//5. E = A x D

		
		//함수 이용해서 생성한 배열들 출력
//		printMatrix(table_A, "A");
//		printMatrix(table_B, "B");
//		printMatrix(table_C, "C");
//		printMatrix(table_D, "D");
//		printMatrix(table_E, "E");
		
		System.out.println("end");		
	}

	//배열 출력 함수
	//Arrays.toString()이용
	private static void printMatrix(int[][] arr, String string) {
		// TODO Auto-generated method stub
		
	}

}
