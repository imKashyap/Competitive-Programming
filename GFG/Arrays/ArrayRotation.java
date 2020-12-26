package gfg.arrays;

/*package whatever //do not write package name here */
import java.util.Scanner;

class ArrayRotation {
	public static void main(String[] args) {
		// code
		Scanner scr = new Scanner(System.in);
		int T = scr.nextInt();
		StringBuilder res = new StringBuilder();
		while (T-- != 0) {
			int N = scr.nextInt();
			int D = scr.nextInt();
			int[] arr = new int[N];
			boolean isAtEnd = false;
			for (int i = 0, j = 0; j < N; j++) {
				if (isAtEnd)
					arr[i] = scr.nextInt();
				else
					arr[N - D + i] = scr.nextInt();
				i++;
				if (D == i && !isAtEnd) {
					i = 0;
					isAtEnd = true;
				}
			}
			for (int i = 0; i < N; i++)
				res.append(arr[i] + " ");
			System.out.println(res);
			res.delete(0, res.length());

		}
		scr.close();
	}
}
