package practice.stack;

import practice.linkedlist.MyLinkedList;

public class MyStack<E> {
	private MyLinkedList<E> ll = new MyLinkedList<>();

	public void push(E data) {
		ll.add(data);
	}

	public E pop() throws Exception {
		if (ll.head == null)
			throw new Exception("Cannot remove from an empty stack");
		E data = ll.get(ll.size() - 1);
		ll.remove(ll.size() - 1);
		return data;
	}

	public E peek() throws Exception {
		if (ll.head == null)
			throw new Exception("Cannot remove from an empty stack");
		return ll.get(ll.size() - 1);
	}

	public int search(E data) throws Exception {
		int index = -1;
		for (int i = 0; i < ll.size(); i++) {
			if (ll.get(i) == data) {
				index = i;
				break;
			}
		}
		return index == -1 ? -1 : ll.size() - index;
	}

	public boolean isEmpty() {
		return ll.isEmpty();
	}

}
