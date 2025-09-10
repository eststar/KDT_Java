package com.ruby.java.ch07;


/*class Person {
	//private는 해당 클래스 밖에서는 직접 접근 불가
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return name + ", " + age;
	}
}

class Employee extends Person {
	private String dept;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	} 
	// method overriding //상속받는 부모의 메서드를 무시하고 자식에서 새로 정의한 동일한 형태의 다른 내용을 가진 함수 사용
	@Override //컴파일러에게 알리고 공유시 알리기 위해 표시 annotation
	public String toString() {
		//return name + ", "+age + "," + dept;//오류 발생: 이유는 name,age가 Person의 private이기 때문
		//283페이지 하단 문단 이해
//		return getName() + ", "+this.getAge() + "," + dept; // this는 현재 메서드를 호출한 객체. 생략하면 컴파일러가 자동으로 사용
		return super.toString() + "," + dept;
	}
}
class Professor extends Person {
	private String subject;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	// method overriding
	public String toString() {
//		return name + ", "+age + "," + subject; // 부모 private 필드 직접 접근 불가
		//return getName() + ", "+getAge() + "," + subject;
		return super.toString() + "," + subject;
	}
}
class Student extends Person {
	private String major;
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	// method overriding - 285페이지 중간: 1,,2,3,4 설명 암기
	public String toString() {
//		return name + ", "+age + "," + major; // 부모 Person 의 private 필드 직접 접근 불가
//		return this.getName() + ", "+getAge() + "," + major;
		//아직도 중복 코딩 발생
		//getName() + ", "+getAge() 가 반복적으로 사용
		return super.toString() + major;
		//상위 클래스의 toString() 실행해서 중복 줄임. super 상위클래스
	}
}

class Rectangle{
	int width; 
	int height;
	
	public Rectangle(int width,	int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle 값: ("+ width +"), ("+ height+")";
	}
}*/

public class ClassMethodOverriding7_2_1 {
	public static void main(String[] args) {
//		Rectangle r = new Rectangle(10, 20);
//		System.out.println(r);
		//println이 요구하는 것은 String. 
		//toString()이 Override 되지 않은 객체 넣으면 컴파일러가 자동으로 최상위 객체Object의 Object.toString()적용. 
		//결과 r인스턴스의 정보?해시값?주소? 직접 출력 
		//객체 내에서 toString()을 오버라이드 하면 r을 print하면 Override한 toString()이 실행되어서 재정의한 내용 출력(실행)
		
	    Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();

		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");

		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");

		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");

		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		
		System.out.println(e);// jvm이 객체를 String으로 변환하는 .toString() 자동으로 부름
	}
}
