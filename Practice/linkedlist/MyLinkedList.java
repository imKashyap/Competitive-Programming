package practice.linkedlist;

public class MyLinkedList<E> {
	public static class Node<E> {
		E data;
		Node<E> next;

		Node(E data) {
			this.data = data;
		}
	}

	public Node<E> head;

	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		if (head == null) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}

	public void remove(int index) throws Exception {
		if (index > size() - 1)
			throw new Exception("Index must be smaller than size of linked list.");
		if (head == null)
			throw new Exception("Cannot remove from an empty Linked List");
		if (index < 0)
			throw new Exception("Index must be greater than or equal to zero.");
		if (head.next == null) {
			head = null;
			return;
		}
		if (index == 0) {
			head = head.next;
			return;
		}
		Node<E> temp = head;
		int i = 0;
		while (temp.next != null) {
			if (i + 1 == index) {
				if (temp.next.next == null)
					temp.next = null;
				else
					temp.next = temp.next.next;
				break;

			}
			temp = temp.next;
			i++;
		}

	}

	public int size() {
		if (head == null)
			return 0;
		int count = 1;
		Node<E> temp = head;
		while (temp.next != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public E get(int index) throws Exception {
		if (head == null)
			throw new Exception("Cannot peek from an empty Linked List");
		if (index < 0)
			throw new Exception("Index must be greater than or equal to zero.");
		if (index > size() - 1)
			throw new Exception("Index must be smaller than size of linked list.");
		Node<E> temp = head;
		int i = 0;
		E data = null;
		while (temp != null) {
			if (i == index) {
				data = temp.data;
			}
			temp = temp.next;
			i++;
		}
		return data;

	}

	public boolean isEmpty() {
		return head == null;
	}
}
