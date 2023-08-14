import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import task.Hopital;
import task.HttpStatus;
import task.Task;
import task.TaskType;
import test.ArrayStack;

public class Main {

	public static void main(String... argv){

		func(new String[] {"숟가락", "젓가락", "포크"});

		String[] sArr = new String[3];
		sArr[0] = "숟가락";
		sArr[1] = "젓가락";
		sArr[2] = "포크";

		func(sArr);
	}


	public static void func(String[] args) {
		for (String s : args) {
			System.out.println(s);
		}
	}

}
