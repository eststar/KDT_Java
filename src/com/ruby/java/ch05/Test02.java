package com.ruby.java.ch05;

public class Test02 {
	static void test(String name, int... v) {
		System.out.print(name + " : ");
		for(int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		test("abc", 1,2,3);
		test("wadd", 3);
		test("가나다", 6,7,8,9,9,0);
	}

}
