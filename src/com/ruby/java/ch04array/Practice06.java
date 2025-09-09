package com.ruby.java.ch04array;

//두개의 배열을 합치되 합친 배열에서 두 배열의 요소가 번갈아 나오도록 구현
// [a1, a2, a3] [b1, b2, b3] [a1, b1, a2, b2, a3, b3]

import java.util.Arrays;
import java.util.Random;

public class Practice06 {
	//배열을 인자로 받아 요소를 출력
	public static void showArray(int[] arr)
	{
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			if(i == (arr.length-1))
			{
				System.out.println(arr[i] + "]");
				continue;
			}				
			System.out.print(arr[i] + ",");
		}
	}
	
	public static void main(String[] args) {
		//랜덤 입력 변수 설정
		Random rd = new Random();
		
		//배열 선언
		int[] arrayA = new int[5];
		int[] arrayB = new int[5];
		int[] arrayC = new int[arrayA.length + arrayB.length];
		
		//랜덤으로 값 입력
		for(int i = 0; i < 5; i++)
		{
			arrayA[i] = rd.nextInt(100);
			arrayB[i] = rd.nextInt(100);
			
			//번갈아가면서 입력(교차 합치기)
			arrayC[(i*2)+0] = arrayA[i];
			arrayC[(i*2)+1] = arrayB[i];
		}
		
		//Arrays.toString(배열) 로 배열을 문자열 형태로 반환
		System.out.println("A"+Arrays.toString(arrayA));
		System.out.println("B"+Arrays.toString(arrayB));
		System.out.println("C"+Arrays.toString(arrayC));
		
//		showArray(arrayA);
//		showArray(arrayB);
//		showArray(arrayC);
//		
	}

}
