package com.ruby.java.ch05;

public class Test01 {
	//가변 길이 인자. v는 배열로 자동으로 인식
	static void test(int... v) {
		System.out.print(v.length + " : ");
		
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		test(1);
		test(1, 3);
		test(1, 3, 5);
	}

}
