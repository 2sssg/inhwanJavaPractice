package stream_practice;

public class Student {
	private String name;
	private int grade;
	private int classroom;
	private int number;
	private String school;
	private int score;

	public Student(String name, int grade, int classroom, int number, String school) {
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
		this.school = school;
		this.score = 0;
	}

	public Student(String name, int grade, int classroom, int number, String school, int score) {
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
		this.school = school;
		this.score = score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return this.name;
	}

	public int getGrade() {
		return this.grade;
	}

	public int getClassroom() {
		return this.classroom;
	}

	public int getNumber() {
		return this.number;
	}

	public String getSchool() {
		return this.school;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", grade=" + grade +
				", classroom=" + classroom +
				", number=" + number +
				", school='" + school + '\'' +
				", score=" + score +
				'}';
	}

	public Student(Student student) {
		this.name = student.name;
		this.grade = student.grade;
		this.classroom = student.classroom;
		this.number = student.number;
		this.school = student.school;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}


}
