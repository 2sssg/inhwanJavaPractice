package test;

import java.util.Objects;

public class MyLinkedList {

	Node first;
	Node last;

	public MyLinkedList() {
		first = null;
		last = null;
	}

	public void add(Node node, int elem) {
		Node newNode = new Node(elem);
		Node nextNode = node.next;
		newNode.next = nextNode;
		node.next = newNode;
	}

	public void add(int elem) {
		Node newNode = new Node(elem);

		// 아직 들어간게 아무것도 없다면
		if (first == null && last == null) {
			first = newNode;
			last = newNode;
			return ;
		}
		add(last, elem);
		last = newNode;
	}

	public void add(int index, int elem) {
		int nowIndex = 0;
		for (Node currentNode = first; currentNode.equals(last); currentNode = currentNode.next) {
			if (nowIndex == index) {
				add(currentNode, elem);
			}
		}
	}

	class Node {
		int item;
		Node prev;
		Node next;

		public Node(int item) {
			this.item = item;
			next = null;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			Node node = (Node) o;
			return item == node.item && Objects.equals(prev, node.prev) && Objects.equals(next, node.next);
		}

		@Override
		public int hashCode() {
			return Objects.hash(item, prev, next);
		}
	}
}
