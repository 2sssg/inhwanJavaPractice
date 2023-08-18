package test;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {

	private final int DEFAULT_CAPACITY = 10;
	private int currentCapacity = DEFAULT_CAPACITY;
	private int currentPointer = 0;
	private T[] arr;

	public MyArrayList() {
		arr = (T[]) new Object[DEFAULT_CAPACITY];
	}



	public void add(T elem) {
		if (currentCapacity == currentPointer) {
			currentCapacity *= 2;
			Object[] newArr = new Object[currentCapacity];
			for (int i = 0; i < currentCapacity / 2; ++i) {
				newArr[i] = arr[i];
			}
			arr = (T[]) newArr;
		}
		arr[currentPointer] = elem;
		currentPointer++;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("[");
		for (int i = 0; i < currentPointer - 1; ++i) {
			sb.append(arr[i]).append(", ");
		}
		sb.append(arr[currentPointer - 1]).append("]");

		return sb.toString();
	}
}
