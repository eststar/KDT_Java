package com.ruby.java.ch06;

/*
 * class method를 가장 확실히 공부할 수 있는 코드이다 , 교재 243페이지
 */
public class StaticMethodTest {
	int num = 123;

	//main은 static이므로 파일의 class가 따로 객체로 만들어지지 않아도 가장 먼저 실행
	
	public static void main(String[] args) {
		StaticMethodTest.print1();
		//StaticMethodTest.print2();//오류
		//객체 생성없이 static 메서드인 main을 jvm이 실행하므로 
		//생성되지 않은 일반 메서드는 main내에서 사용 불가, static은 사용가능
		
		print1();
		// print2();//에러가 나는 이유를 알아야 한다 //일반 멤버 메서드는 객체 생성해야 사용가능
		StaticMethodTest smt = new StaticMethodTest();
		smt.print2();
		// print2();//이유는?
		//System.out.println(num);//객체 생성 없이 사용하므로 안된다 - 난이도 높은 설명이다
		//일반 멤버 메서드이므로 객체 생성 없이 사용 불가
		System.out.println(smt.num);
	}

	public static void print1() {
		// 클래스 메소드는 클래스 변수만 접근해야 한다
		// int num2 = num;//실행하기 전에 값이 있어여 하는데 num 값은 없다. 
		// num은 클래스의 멤버 필드 인스턴스 필드이므로 객체 생성전에는 값이 없음
		System.out.println("hello ");
		// System.out.println("hello " + num);//num 변수는 객체가 있어야 사용 가능하다
	}

	public void print2() {
		int num3 = num;// instance가 있으므로 오류가 아니다
		int num4 = this.num;
		//객체가 생성되었을때만 사용되는 메서드 내의 구문이므로 print2를 호출할때 객체를 통해 호출하므로 그 print2 객체의 정보를 가진상태
		System.out.println("java " + num);// 객체가 만들어질 때 사용하므로 허용
	}
}
//243페이지 (3) 정적 코드 블럭 앞 문단의 마지막 두줄: 명심 기억해야 할 내용