package edu.pnu;

import java.util.Scanner;

class Phone {
	
	private String number; //010-1234-5678 //private 해당 class 내부에서만 사용가능
	String name;
	String alias;
	
	private void printNumber() {
		System.out.println(number);
	}
	
	public void print() {
		printNumber();
	}
	
}

public class MyTest01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Phone phone = new Phone(); 
		
		phone.print();
		
		sc.close();
	}
}
