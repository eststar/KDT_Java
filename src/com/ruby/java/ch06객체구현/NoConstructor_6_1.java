package com.ruby.java.ch06객체구현;

class Student {
// 필드
	/*
	 * ("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92},passFails, -1), name,
	 * age, subjects[], scores[], passFail[], count를 private으로 선언 count는 배열의 index로
	 * 사용 numberStudents를 정적 필드로 선언
	 */
	public static int numberStudents;

	private String name;
	private int age;
	private String[] subjects;
	private int[] scores;
	private int[] passFail;
	private int count;

// 생성자
	/*
	 * name, age, subjects[], scores[], passFail[], count를 매개변수로 전달받는 생성자 정의
	 * 
	 */
	//생성자 오버로딩
	//1번용
	public Student(){
		
	}
	//2번용
	public Student(String name, int age, String[] subjects, int[] scores, int count) {

		this.name = name;
		this.age = age;
		this.subjects = subjects;
		this.scores = scores;
		this.count = count;
	}
	//3번용
	public Student(String name, int age, String[] subjects, int[] scores, int[] passFail, int count) {

		this.name = name;
		this.age = age;
		this.subjects = subjects;
		this.scores = scores;
		this.passFail = passFail;
		this.count = count;
	}

// setter 메소드: setName(String name), setAge(int age), setSubjects(String
// subjects[]), setScores(int scores[]), setCount(int num)
	// 학생 수를 반환하는 정적 메소드getNumberStudents()
	
	//getter setter
	public static void setNumberStudents(int numberStudents) {
		Student.numberStudents = numberStudents;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSubjects(String subjects[]) {
		this.subjects = subjects;
	}

	public void setScores(int scores[]) {
		this.scores = scores;
	}

	public void setCount(int num) {
		this.count = num;
	}

	public static int getNumberStudents() {
		return numberStudents;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public int[] getScores() {
		return scores;
	}

	public int getCount() {
		return count;
	}

// 학생 정보를 출력하는 메소드 (예시용)
	public void printStudent() {
		/*
		 * 이름 = **, 나이 = ** 과목1 = **, 점수1 = ** 과목2 = **, 점수2 = ** ... 등으로 출력
		 */

		System.out.println("이름 = " + name + ", 나이 = " + age);
		for (int i = 0; i < subjects.length; i++) {

			System.out.println(subjects[i] + " : " + "점수 = " + scores[i]);
		}
		System.out.println("-".repeat(20));
	}

// 학생 정보를 출력하는 메소드 (예시용)
	public void printStudentInfo() {
		/*
		 * 이름 = **, 나이 = ** 과목1 = **, 점수1 = **, 통과여부=pass 과목2 = **, 점수2 = **, 통과여부=fail
		 * ... 등으로 출력
		 */

		System.out.println("이름 = " + name + ", 나이 = " + age);
		for (int i = 0; i < subjects.length; i++) {

			System.out.println(subjects[i] + " : " + "점수 = " + scores[i] + ", 통과여부 = "
					+ ((passFail[i] <= scores[i]) ? "pass" : "fail"));
		}

		System.out.println("-".repeat(20));
	}

// 통과 여부 (모든 과목을 통과했는지 확인)
	public boolean isPassed() {
		// 주어진 학생이 모든 과목 통여 여부를 반환
		boolean pF = false;
		for (int i = 0; i < count; i++) {
			if (passFail[i] <= scores[i])
				pF = true;
		}

		return pF;
	}

// 6.2.2 각 학생의 성적 테이블을 출력하는 정적 메소드
	public static void printAllStudents(Student[] students) {
		// 학생 이름 + 과목명, 과목 점수 .... + 과목통과여부:pass or fail

		for (Student obj : students) {
			obj.printStudentInfo();
		}

	}

// 6.2.2 과목별 최대/최소 점수 및 해당 학생을 출력하는 정적 메소드
	public static void printSubjectStats(Student[] students) {
		int subjectNum = students[0].getSubjects().length;
		int[] maxs = new int[subjectNum];
		int[] mins = new int[subjectNum];
		String[] maxStudentNames = new String[subjectNum];
		String[] minStudentNames = new String[subjectNum];
		String[] subjects = students[0].getSubjects();
		
		for (int i = 0; i < subjectNum; i++) {
			maxs[i] = mins[i] = students[0].getScores()[i];
			maxStudentNames[i] = minStudentNames[i] = students[0].getName();
		}

		for (int i = 0; i < subjectNum; i++) {
			for (Student student : students) {

				if (maxs[i] <= student.getScores()[i]) {
					maxs[i] = student.getScores()[i];
					maxStudentNames[i] = student.getName();
				}

				if (mins[i] >= student.getScores()[i]) {
					mins[i] = student.getScores()[i];
					minStudentNames[i] = student.getName();
				}

			}
		}

		for (int i = 0; i < subjectNum; i++) {
			System.out.println(subjects[i] + " : " + "최대 : " + maxs[i] + "점-" + maxStudentNames[i] + ", " + "최소 : "
					+ mins[i] + "점-" + minStudentNames[i]);
		}

	}
}

public class NoConstructor_6_1 {

	static Student makeStudent(String name, int age, String[] subjects, int[] scores, int value) {
		Student s = new Student();
		// setter를 사용한 구현
		s.setName(name);
		s.setAge(age);
		s.setSubjects(subjects);
		s.setScores(scores);
//		s.setCount(value);

		return s;
	}

	// showStudents() 메소드 구현 -printStudent() 메소드를 호출하여 구현
	private static void showStudents(Student[] students) {
		// TODO Auto-generated method stub
		for (Student student : students) {
			student.printStudent();
		}

	}

	public static void main(String[] args) {
		String[] subjects = { "수학", "국어", "영어", "과학", "역사" };

		Student[] students = { makeStudent("홍길동", 21, subjects, new int[] { 85, 90, 78, 88, 92 }, -1),
				makeStudent("김유신", 22, subjects, new int[] { 75, 80, 85, 90, 95 }, -1),
				makeStudent("계백", 23, subjects, new int[] { 65, 70, 75, 80, 85 }, -1),
				makeStudent("강감찬", 24, subjects, new int[] { 95, 92, 88, 84, 91 }, -1),
				makeStudent("을지문덕", 25, subjects, new int[] { 88, 76, 85, 79, 90 }, -1)
				// ("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, -1),
				// ("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, -1),
				// ("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, -1),
				// ("을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, -1)
		};

		// 학생 정보 출력 (예시)
		showStudents(students);
	}

}
