package org.example.grade;

public class Course {
	private static String subject; // 과목명
	private static int credit; // 학점
	private static String grade; // 성적 (A+, A, B+ ...)

	public Course(String subject, int credit, String grade) {
		this.subject = subject;
		this.credit = credit;
		this.grade = grade;
	}

	public int getCredit() {
		return credit;
	}

	public double getGradeToNumber() {
		double grade = 0;
		switch (this.grade) {
			case "A+":
				grade = 4.5;
				break;
			case "A":
				grade = 4.0;
				break;
			case "B+":
				grade = 3.5;
				break;
			case "B":
				grade = 3.0;
				break;
			case "C+":
				grade = 2.5;
				break;
			case "C":
				grade = 2.0;
				break;
		}

		return grade;
	}
}
