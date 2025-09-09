package com.ruby.java.ch05;

/*
 * class Box {
    // 필드 (속성)
    double width;  // 가로
    double height; // 세로
    double depth;  // 높이
    // 부피 계산 메소드
    double getVolume() {
        return width * height * depth;
    }

	// 둘레 길이 계산 메소드
    double getPerimeter() {
        
    }
    
    // 박스 크기 조정 (메소드 오버로딩)
    void resize(double newWidth, double newHeight, double newDepth) {
        //박스의 가로,세로,높이를 변경
    }

    void resize(double scale) {
        //박스의 가로,세로,높이를 scale 비율로 변경
    }
    
    void show() {
    	System.out.println("width="+width+ ", height = " + height + ", depth = " + depth);
    }
    
    @Override
    String toString() {
       return "width="+width+ ", height = " + height + ", depth = " + depth;
    }
 */

class Box {
	// 필드 (속성)
	double width; // 가로
	double height; // 세로
	double depth; // 높이
	// 부피 계산 메소드
	
	public Box() {
		super();
	}
	
	public Box(double width, double height, double depth) {
		super();
		this.width= width; // 가로
		this.height =height; // 세로
		this.depth = depth; // 높이
		
	}

	public double getVolume() {
		return width * height * depth;
	}

	// 둘레 길이 계산 메소드
	public double getPerimeter() {
		return (width + height + depth) * 4;
	}

	// 박스 크기 조정 (메소드 오버로딩)
	public void resize(double newWidth, double newHeight, double newDepth) {
		// 박스의 가로,세로,높이를 변경
		width = newWidth;
		height = newHeight;
		depth = newDepth;
	}

	public void resize(double scale) {
		// 박스의 가로,세로,높이를 scale 비율로 변경
		width *= scale;
		height *= scale;
		depth *= scale;
	}

	public void show() {
		System.out.println("width=" + width + ", height = " + height + ", depth = " + depth);
	}

	@Override
	public String toString() {
		return "width=" + width + ", height = " + height + ", depth = " + depth;
	}
}

public class Practice02 {

	public static void main(String[] args) {
		// 박스 객체 생성
		Box box1 = new Box(10, 5, 3);
//		Box box1 = new Box();
//		box1.width = 10;
//		box1.height = 5;
//		box1.depth = 3;

		System.out.println("box1");
		// 박스 정보 출력
		box1.show();
		//박스 부피 출력
		System.out.println("부피 " + box1.getVolume());
		// 박스 크기 변경
		box1.resize(15, 8, 5);
		//박스 정보 출력
		box1.show();
		//박스 둘레 길이
		System.out.println("둘레길이 " + box1.getPerimeter());
		// 박스를 2배 확대
		box1.resize(0.5);
		//박스 정보 출력
		box1.show();
		System.out.println();

		Box box2 = new Box(4, 7, 3);
//		Box box2 = new Box();
//		box1.width = 4;
//		box1.height = 7;
//		box1.depth = 3;

		System.out.println("box2");
		System.out.println(box2);
		// box2.show();
		// 박스 크기 변경
		box2.resize(9, 3, 8);
		System.out.println(box2);
		// box2.show();

		// 박스를 2배 확대
		box2.resize(1.5);
		System.out.println(box2);
		// box2.show();

	}
}
