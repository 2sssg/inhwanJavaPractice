package test;

public class ArrayStack {

	private int[] arr;

	public ArrayStack(int value) {
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private int value;

	public ArrayStack(int[] arr) {
		this.arr = arr;
	}


	public void push() {
	}

	public void pop() {
		for (int i = arr.length - 1; i >= 0; --i) {
			if (arr[i] == 0) continue;
			arr[i] = 0;
			return ;
		}
	}
}
