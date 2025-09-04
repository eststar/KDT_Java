package com.ruby.java.ch04Array;

public class Test38 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				arr[i][j] = num++;
			}
		}
		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[0].length; j++)
//			{
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.print("\n");
//		}
		
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[0].length; j ++)
//			{
//				if(i == j)
//					sum += arr[i][j];
//			}
//		}
//		
//		int sum1 = 0;
//		for(int i = 0; i < arr.length; i++)
//		{
//			sum1 += arr[i][i];
//		}
//		
//		System.out.println(sum);
//		System.out.println(sum1);
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				sum += arr[i][j];
			}
		}
		
		System.out.println(sum);
		
		int sum1 = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				if(j > i)
					sum1 += arr[i][j];
			}
		}
		
		System.out.println(sum1);
		
	}
}
