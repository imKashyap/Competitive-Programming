package practice.stack;

public class MyStackImplementation {
	public static void main(String[] args) throws Exception {
		MyStack<Integer> mys = new MyStack<>();
		mys.push(23);
		mys.push(21);
		mys.push(11);
		mys.push(43);
		System.out.println(mys.search(45));
	}
}
