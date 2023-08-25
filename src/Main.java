import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;
import stream_practice.Student;
import task.Hopital;
import task.HttpStatus;
import task.Task;
import task.TaskType;
import test.ArrayStack;
import test.MyArrayList;

public class Main {


	public static void main(String... argv) throws IOException {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("1번사람", 1, 1, 1, "1번학교"));
		studentList.add(new Student("2번사람", 1, 1, 1, "1번학교"));
		studentList.add(new Student("3번사람", 1, 2, 10, "1번학교"));
		studentList.add(new Student("4번사람", 2, 3, 11, "1번학교"));
		studentList.add(new Student("5번사람", 3, 1, 1, "1번학교"));
		studentList.add(new Student("6번사람", 3, 1, 12, "1번학교"));

		studentList.add(new Student("7번사람", 1, 12, 12, "2번학교"));
		studentList.add(new Student("8번사람", 2, 1, 12, "2번학교"));
		studentList.add(new Student("9번사람", 2, 1, 1, "2번학교"));
		studentList.add(new Student("10번사람", 3, 3, 2, "2번학교"));
		studentList.add(new Student("11번사람", 3, 1, 12, "2번학교"));


		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getGrade() - o2.getGrade();
			}
		});

		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});

//		Collections.sort(studentList, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Integer.parseInt(o2.getName().split("번")[0]) - Integer.parseInt(o1.getName().split("번")[0]);
//			}
//		});

		Collections.sort(studentList, (o1, o2) ->
				Integer.parseInt(o2.getName().split("번")[0]) - Integer.parseInt(o1.getName().split("번")[0])
		);

		studentList.forEach(System.out::println);





	}



}
