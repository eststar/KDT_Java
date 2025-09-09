package edu.my.practice.ch06;


public class PracticeStaticMethod_6_3 {
	public static void showStudents(Student[] students) {
		for (Student student : students) {
			student.printStudentInfo();
		}
	}

	public static void main(String[] args) {
		String[] subjects = { "수학", "국어", "영어", "과학", "역사" };
		int[] passFails = { 40, 70, 60, 55, 80 };
		Student[] students = { new Student("홍길동", 21, subjects, new int[] { 85, 90, 78, 88, 92 }, passFails, -1),
				new Student("김유신", 22, subjects, new int[] { 75, 80, 85, 90, 95 }, passFails, -1),
				new Student("계백", 23, subjects, new int[] { 65, 70, 75, 80, 85 }, passFails, -1),
				new Student("강감찬", 24, subjects, new int[] { 95, 92, 88, 84, 91 }, passFails, -1),
				new Student("을지문덕", 25, subjects, new int[] { 88, 76, 85, 79, 90 }, passFails, -1)

				/*
				 * 생성자를 사용하여 객체 생성 
				 * ("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92}, passFails, -1), 
				 * ("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, passFails,-1),
				 * ("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, passFails,-1),
				 * ("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, passFails,-1), 
				 * ("을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, passFails,-1)
				 */
		};
		// 학생 수를 정적 메소드 호출로 처리
		Student.numberStudents = students.length;

		// 학생 정보 출력 (예시)
		showStudents(students);

		// 각 학생의 성적 테이블 출력
		Student.printAllStudents(students);

		// 과목별 최대/최소 점수 및 해당 학생 출력
		Student.printSubjectStats(students);
	}

}
