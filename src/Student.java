import java.util.Objects;

/**
 * 향동중학교 학생 [The Student of Korean Hyangdong MiddleSchool Student]
 */
public class Student {

	/** 성명 */
	private String name;
	/** 학년 */
	private int grade;
	/** 학급 */
	private int classNum;
	/** 학번 */
	private int studentNum;

	public void setName(String name){
		this.name = name;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	/**
	 *
	 * @return 이름을 반환함
	 */
	public String getName() {
		return name;
	}

//	@Override
//	public String toString(){
//		return new StringBuilder()
//				.append(this.grade)
//				.append(this.classNum)
//				.append(this.studentNum)
//				.append(" ")
//				.append(this.name)
//				.toString();
//	}
	public Student(int grade, int classNum, int studentNum) {
		this.grade = grade;
		this.classNum = classNum;
		this.studentNum = studentNum;
	}

	/**
	 *
	 * @param grade 학년
	 * @param classNum 학급
	 * @param studentNum 번호
	 * @param name 성명
	 */
	public Student(int grade, int classNum, int studentNum, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.studentNum = studentNum;
		this.name = name;
	}

	public Student() {}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Student student = (Student) o;
		return Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", grade=" + grade +
				", classNum=" + classNum +
				", studentNum=" + studentNum +
				'}';
	}
}
