package com.ruby.java.ch03제어문;

//Annotation: 주석처럼 보이지만 주석이 아니라 컴파일러/JVM에게 전달되는 메타 데이터

//@Override > 클래스 상속시 코드 재사용 정의

/**
 *	@author 홍길동
 *  
 */
public class Test18 {
	/**
	 * @param test 
	 * @param test
	 * @return test
	 */

	public static void main(String[] args) {
		System.out.println();
	}

	public int sum(int a, int b) {

		int salary = 0;
		salary += 10;
		System.out.println();
		//
		return a + b;
	}
}
