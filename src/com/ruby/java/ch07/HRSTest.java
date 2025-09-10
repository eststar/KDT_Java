package com.ruby.java.ch07;

//abstract class
abstract class Employee2 {//추상 클래스 
	String name;
	int salary;
	
	
//	public Employee2() {
//	}
//	
//	public Employee2(String name, int salary) {
//		this.name = name;
//		this.salary = salary;
//	}
	
	public abstract void calcSalary();//추상 메소드
	public abstract void calcBonus();
}
abstract class Salesman extends Employee2 {//307페이지 하단 밑에서 두번째 문단
	int salesQty;
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급+판매수당*판매량");
	}
	//상위 클래스의 calcBonus를 구현 하지 않으려면 abstract 클래스로 선언해야함. 
	//상위 추상클래스의 추상 메서드를 구현하지 않으려면 abstract 클래스여야함
}

//concrete class
class DomesticSalesman extends Salesman {
	int domesticSalesQty;
	//Salesman에서 calcSalary 구현했으므로 구현 안해도 추상클래스 아님
	public void calcBonus() {
		System.out.println("DomesticSalesman 보너스 = 기본급* 0.01");
	}
}
class Consultant extends Employee2 {
	int consultingHours;
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급+컨설팅단가 * 컨설팅 시간");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급* 0.02");
	}
}
class Manager extends Employee2 {
	int teamNumbers;
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급+관리자단가 * 팀수");
	}
	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급* 0.03");
	}
}
public class HRSTest {

	public static void main(String[] args) {
		Employee e = new Employee();
//		e.name;
		//Salesman s = new Salesman();//추상 클래스
		Salesman s = new DomesticSalesman();
		Consultant c = new Consultant();
		Manager m = new Manager();
//		e.calcSalary();
		s.calcSalary();
		c.calcSalary();
		m.calcSalary();

	}

}
