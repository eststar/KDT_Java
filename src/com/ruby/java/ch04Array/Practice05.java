package com.ruby.java.ch04Array;

import java.util.Random;

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
		Random rd = new Random();

		int[][] table_A = new int[3][5];
		int[][] table_B = new int[3][5];
		int[][] table_C = new int[3][5];

		for (int i = 0; i < table_A.length; i++) {
			for (int j = 0; j < table_A[i].length; j++) {
				table_A[i][j] = rd.nextInt(100);
				table_B[i][j] = rd.nextInt(100);
				table_C[i][j] = table_A[i][j] + table_B[i][j];
			}
		}
		System.out.println("A");

		for (int i = 0; i < table_A.length; i++) {
			for (int j = 0; j < table_A[i].length; j++) {
				System.out.print(table_A[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("B");

		for (int i = 0; i < table_B.length; i++) {
			for (int j = 0; j < table_B[i].length; j++) {
				System.out.print(table_B[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("C");

		for (int i = 0; i < table_C.length; i++) {
			for (int j = 0; j < table_C[i].length; j++) {
				System.out.print(table_C[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("D");

		int[][] table_D = new int[5][4];

		for (int i = 0; i < table_D.length; i++) {
			for (int j = 0; j < table_D[i].length; j++) {
				table_D[i][j] = rd.nextInt(101);
				System.out.print(table_D[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("E");

		int[][] table_E = new int[3][4];

		for (int i = 0; i < table_E.length; i++) {
			for (int j = 0; j < table_E[i].length; j++) {
				for (int k = 0; k < table_A[i].length; k++) {
					table_E[i][j] += (table_A[i][k] * table_D[k][j]);
				}
				System.out.print(table_E[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("end");
	}

}
