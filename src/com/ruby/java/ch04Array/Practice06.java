package com.ruby.java.ch04Array;

import java.util.Arrays;
import java.util.Random;

public class Practice06 {
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
		
		System.out.println("A"+Arrays.toString(arrayA));
		System.out.println("B"+Arrays.toString(arrayB));
		System.out.println("C"+Arrays.toString(arrayC));
		
//		showArray(arrayA);
//		showArray(arrayB);
//		showArray(arrayC);
//		
	}

}
