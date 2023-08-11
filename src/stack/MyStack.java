package stack;

import java.util.ArrayList;

public class MyStack<E> {

	private ArrayList<E> core;

	public MyStack() {
		this.core = new ArrayList<>();
	}

	public boolean push(E item){
		return this.core.add(item);
	}

	public E pop(){
		if(this.core.isEmpty()){
			return null;
		}
		return this.core.remove(this.core.size() - 1);
	}

}
