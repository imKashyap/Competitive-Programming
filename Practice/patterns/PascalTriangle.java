package myPrograms.patterns;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int rows = scr.nextInt();
		int[][] pattern = new int[rows][rows + 1];
		pattern[0][0] = 1;
		if (rows > 1) {
			pattern[1][0] = 1;
			pattern[1][1] = 1;
			for (int i = 2; i < rows; i++) {
				pattern[i][0] = 1;
				int j = 1;
				for (; j < i; j++) {
					pattern[i][j] = pattern[i - 1][j - 1] + pattern[i - 1][j];
				}
				pattern[i][j] = 1;
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(pattern[i][j]);
			System.out.println();
		}
		scr.close();
	}
}
