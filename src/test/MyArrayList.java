package test;

import java.util.ArrayList;

public class MyArrayList {

	private ArrayList<Integer> list = new ArrayList<>();

	public MyArrayList(ArrayList<Integer> list) {
		this.list = list;
	}

//	public void clear() {
//		list.clear();
//	}

	public void add(int elem) {
		list.add(elem);
	}
}
