package stream_practice;

public class Person {

	private String Fname;
	private String Lname;
	private int age;

	public Person(String fname, String lname, int age) {
		Fname = fname;
		Lname = lname;
		this.age = age;
	}

	public Person() {
	}

	public String getFname() {
		return Fname;
	}

	public String getLname() {
		return Lname;
	}

	public int getAge() {
		return age;
	}


	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setFname(String fname) {
		Fname = fname;
		return this;
	}

	public Person setLname(String lname) {
		Lname = lname;
		return this;
	}
}
