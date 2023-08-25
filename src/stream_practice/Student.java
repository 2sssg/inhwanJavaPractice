package stream_practice;

public class Student {
	private String name;
	private int grade;
	private int classroom;
	private int number;
	private String school;

	public Student(String name, int grade, int classroom, int number, String school) {
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
		this.school = school;
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
				'}' + "\n\n";
	}
}
