package com.ruby.java.ch04Array;

//1차원 배열 생성 및 초기화
/*
 * 정수 1차원 배열 price를 선언하고 5개 값으로 초기화:
 * 49, 91, 87, 67, 73
 */

// for문을 사용한 최대값 찾기
/*
 * 최대값 변수를 priceMax로 선언한 후에 for 문을 사용하여 최대값을 찾는다
 * 배열 price는 확장형 for 문으로 출력, 출력 형태는 다음과 같다:
 * [1,2,3,4,5]
 * 최대값 출력은 다음과 같다
 * 최대값 = **
 * 
 */
public class Practice02 {
	public static void main(String[] args) {
		int[] price = { 49, 91, 87, 67, 73 };

		int priceMax = 0;

		int cnt = 0;
		for (int num : price) {
			
			if(cnt == 0)
				System.out.print("[" + num + ",");
			else if(cnt == (price.length - 1))
				System.out.println(num + "]");
			else
				System.out.print(num + ",");
			cnt++;
			
			if (priceMax < num)
				priceMax = num;
		}

		System.out.println("최대값 = " + priceMax);
	}

}
