package edu.my.practice.ch06;

public class UseConstructor_6_2 {
	static void showStudents(Student[] students) {
		for (Student student : students) {
			student.printStudent();
		}
	}

	public static void main(String[] args) {
		String[] subjects = { "수학", "국어", "영어", "과학", "역사" };

		Student[] students = { new Student("홍길동", 21, subjects, new int[] { 85, 90, 78, 88, 92 }, -1),
				new Student("김유신", 22, subjects, new int[] { 75, 80, 85, 90, 95 }, -1),
				new Student("계백", 23, subjects, new int[] { 65, 70, 75, 80, 85 }, -1),
				new Student("강감찬", 24, subjects, new int[] { 95, 92, 88, 84, 91 }, -1),
				new Student("을지문덕", 25, subjects, new int[] { 88, 76, 85, 79, 90 }, -1)
				/*
				 * 생성자를 사용하여 객체 생성 
				 * ("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92}, -1),
				 * ("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, -1),
				 * ("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, -1),
				 * ("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, -1),
				 * ("을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, -1)
				 */
		};
		// 학생 수를 정적 메소드 호출로 처리

		Student.setNumberStudents(students.length);

		// 학생 정보 출력 (예시)
		showStudents(students);
	}
}