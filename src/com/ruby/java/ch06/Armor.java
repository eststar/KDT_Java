package com.ruby.java.ch06;

class Armor {
	//클래스의 속성. field
	private String name; 
	int height;

	//메소드
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	//value: 로컬 변수
	public void setName(String value) {
		name = value;
	}
	
	//getter
	public int getHeight() {
		return height;
	}
	
	//setter
	public void setHeight(int value) {
		height = value;
	}
}
