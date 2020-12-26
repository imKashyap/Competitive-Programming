package myPrograms.arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int row1, column1, row2, column2;
		System.out.println("Enter no. of rows and columns of 1st matrix:");
		row1 = scan.nextInt();
		column1 = scan.nextInt();
		System.out.println("Enter no. of row and columns of 2nd matrix:");
		row2 = scan.nextInt();
		column2 = scan.nextInt();
		if (column1 != row2)
			System.out.println("Multiplication not possible!");
		else {
			int[][] matrix1 = new int[row1][column1];
			int[][] matrix2 = new int[row1][column1];
			System.out.println("Matrix 1:");
			matrix1 = initializeArray(row1, column1);
			System.out.println("Matrix 2:");
			matrix2 = initializeArray(row2, column2);
			int product[][] = calculateProduct(matrix1, matrix2, row1, row2, column2);
			displayProduct(product, row1, column2);
		}
		scan.close();
	}

	static int[][] initializeArray(int rows, int cols) {
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			System.out.println("Enter elements of row " + i);
			for (int j = 0; j < cols; j++)
				arr[i][j] = scan.nextInt();
		}
		return arr;
	}

	static int[][] calculateProduct(int[][] arr1, int[][] arr2, int row1, int common, int col2) {
		int[][] product = new int[row1][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int k = 0; k < common; k++) {
					product[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		return product;
	}

	static void displayProduct(int[][] arr, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

}
