package practice.linkedlist;

public class MyLinkedListImplementation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> ll = new MyLinkedList<>();
		ll.add(23);
		ll.add(11);
		ll.add(2);
		ll.add(1);
		ll.add(33);
		ll.add(17);
		ll.remove(5);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
	}

}
