package com.ruby.java.ch07;

//final 클래스는 상속 불가
class Person2 {
//final class Person2 { 
	//final 제어자는 적용한 변수 값을 최종값, 상수값(const), 더이상 변경 할 수 없는 값으로 설정.
	//초기화를 최초 한번 수행해야함 
	private final String ssn_id;
//	private final String ssn_id = "2025_09";
	private String name;
	private int age;

//	public Person2() {// 오류 - 이유는?
//		System.out.println("Person2() 생성자 실행!");
//	}

	public Person2(String sid, int age) {// final 변수 초기화
		ssn_id = sid; // 필드 선언시에 안했으면 객체 생성시 생성자에서 final 변수 초기화
		this.age = age;
		System.out.println("Person2(sid, age) 생성자 실행!");
	}

	void set_ssn_id(String sid) {
//		ssn_id = sid;// 오류 - 이유는?
	}

	public final String toString() {
		return name + ", " + age;
	}
}

//상위 class가 final이기 때문에 상속 불가
class Student2 extends Person2 {
	String dept;

	public Student2(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	//상위 클래스의 동일함수가 final로 선언 되었기때문에 Override불가
//	public final String toString() {
//		return super.toString() + ", " + dept;
//	}
}

public class PersonFinal {

	public static void main(String[] args) {
//		Student2 s2 = new Student2("딥러닝");
//		System.out.println(s2);

	}

}
