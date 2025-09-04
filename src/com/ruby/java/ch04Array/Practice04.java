package com.ruby.java.ch04Array;

import java.util.Random;

/*
 * 난수 배열의 최대, 최소, 평균 구하기
 * 0부터 100까지의 정수 난수 10개를 생성하여 배열에 저장
 * 배열에서 최대값, 최소값, 평균을 구하기
 *   >> for문을 사용한 최대값 찾기 - 교재 149 페이지의 배열 길이: length 사용
 * 출력 내용:
 *   배열 price는 확장형 for 문으로 출력, 출력 형태는 다음과 같다:
 *   [1,2,3,4,5]
 *   최대값 출력은 다음과 같다
 *   최대값 = **
 *   최소값, 평균값 출력은 최대값 출력과 같다.
 *   


 */
public class Practice04 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[10];
				
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = rd.nextInt(101);
		}
		
		int max = arr[0];
		int min = arr[0];
		double avg = 0.0;
		int sum = 0;
		int cnt = 0;
		
		for(int num : arr)
		{
			if(cnt == 0)
				System.out.print("[" + num + ",");
			else if(cnt == (arr.length - 1))
				System.out.print(num + "]");
			else
				System.out.print(num + ",");
			cnt++;
			
			sum += num;
			if(max < num)
				max = num;
			if(min > num)
				min = num;
		}
		
		avg = (double)sum / arr.length;
		
		System.out.println();
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		
	}

}
