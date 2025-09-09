package com.ruby.java.ch06;

public class Member {
	//인스턴스 필드
	private String name;
	private int age;
	
	//생성자 Constructor
	public Member() {
		this("guest");
//		System.out.println("Member() 생성자 실행");
	}
	
	public Member(String name) {
		this(name, 0);
//		System.out.print("Member(String) 생성자 실행 : ");
//		System.out.println(name);		
	}
	
	public Member(String name, int age) {
//		System.out.print("Member(String, int) 생성자 실행 : ");
//		System.out.println(name + " : "+ age);
		this.name = name;
		this.age = age;		
	}
	
	//메서드
	public void setName(String name) {
		
	}
	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		Member m1 = new Member();
		Member m2 = new Member("aaa");
		Member m3 = new Member("aaa", 111);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}

}
