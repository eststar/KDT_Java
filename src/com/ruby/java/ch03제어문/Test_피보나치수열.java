package com.ruby.java.ch03제어문;

import java.util.Scanner;

// Fibonacci numbers

/*
 * 피보나치 수열: 0 1 1 2 3 5 8 ...
 * int n = sc.nextInt(); //항의 수
 * int first = 0;
 * int second = 1;
 * sysout(first);
 * for (;;) {
 *    sysout(second)
 *    int next = first + second;
 *    first = second;
 *    second = next;
 * }
 * 
 */

/*
 * 피보나치 수열: 0 1 1 2 3 5 8 ...
 * int n = sc.nextInt(); //항의 수
 * int first = 0;
 * int second = 1;
 * sysout(first);
 * do {
 *    sysout(second)
 *    int next = first + second;
 *    first = second;
 *    second = next;
 * } while();
 * 
 */

/*
 * 피보나치 수열: 0 1 1 2 3 5 8 ...
 * int n = sc.nextInt(); //항의 수
 * int first = 0;
 * int second = 1;
 * sysout(first);
 * while() {
 *    sysout(second)
 *    int next = first + second;
 *    first = second;
 *    second = next;
 * }
 * 
 */
public class Test_피보나치수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //항의 수
		
		int first = 0;
		int second = 1;
		
		System.out.println("for문");
		
		System.out.print(first + " ");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(second + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		
		first = 0;
		second = 1;
		
		System.out.println();
		System.out.println("while문");
		System.out.print(first + " ");
		
		int cnt = 0;
		while(cnt < n)
		{
			System.out.print(second + " ");
			
			if(cnt == 7)
			{
				cnt++;
				continue;
			}
			
//			if(cnt != 8)
//				System.out.print(second + " ");
			
			int next = second + first;
			first = second;
			second = next;
			
			cnt++;
		}
		
		first = 0;
		second = 1;
		cnt = 0;
		
		System.out.println();
		System.out.println("do while문");
		System.out.print(first + " ");
		
		do {
			
			System.out.print(second + " ");
			int next = second + first;
			first = second;
			second = next;
			
			cnt++;
			
			if(cnt >= 5)
				break;
			
		}while(cnt < n);
		
		System.out.println();
		System.out.print("종료");
		
		sc.close();
	}

}
