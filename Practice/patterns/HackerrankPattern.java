package myPrograms.patterns;

import java.util.Scanner;

public class HackerrankPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int rows = scr.nextInt();
		int len = rows * 2 - 1;
		int[][] pattern = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				int min = i < j ? i : j;
				min = min < len - i ? min : len - i - 1;
				min = min < len - j - 1 ? min : len - j - 1;
				pattern[i][j] = rows - min;
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++)
				System.out.print(pattern[i][j] + " ");
			System.out.println();
		}
		scr.close();
	}

}
