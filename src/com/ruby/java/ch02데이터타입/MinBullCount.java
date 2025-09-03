package com.ruby.java.ch02데이터타입;

import java.util.Scanner;

public class MinBullCount {
	public static void main(String[] args) {
		
		// 상품가격 지불 위해 필요한 최소 지폐 장수 5만원, 1만원, 5천원, 1천원. 천원 미만 할인
		
		int bill = 0;
		
		Scanner sc = new Scanner(System.in);
		bill = sc.nextInt();
		
		int count_50k = 0;
		int count_10k = 0;
		int count_5k = 0;
		int count_k = 0;
		
		count_50k = bill / 50000;
		bill %= 50000;
		
		count_10k = bill / 10000;
		bill %= 10000;
		
		count_5k = bill / 5000;
		bill %= 5000;
		
		count_k = bill / 1000;
		
		System.out.println("5만원 : " + count_50k + "\n1만원 : " + count_10k +"\n5천원 : " + count_5k +"\n천원 : " + count_k);
	}

}
