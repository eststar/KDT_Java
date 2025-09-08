package com.ruby.java.ch03제어문;

//import java.util.Iterator;

/*
 * 1~100 수열의 합 구하는 for 문 작성
 * int sum = 0;
 * for (변수;조건식;증감식) {
 *   sum += i;
 * }
 * sysout("sum = " + sum);
 */

public class ch03_for {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			sum += i;
			if(sum >20)
				break;
		}
		
		System.out.println(sum);
		
		sum = 0;
		
		int i = 1;
		
		do {
			sum += i;
			i++;
			
			break;
		} while (i <= 100);
		
		sum = 0;
		
		int j = 1;
		
		while (j <= 100) {
			sum += j;
			
			break;
		}
	}
}
