package myPrograms.arrays;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter size of sieve:");
		int size = scr.nextInt();
		boolean[] sieve = new boolean[size + 1];
		sieve[0] = false;
		sieve[1] = false;
		for (int i = 2; i < size; i++)
			sieve[i] = true;
		for (int i = 2; i * i <= size; i++) {
			if (sieve[i] == true) {
				for (int j = i * i; j <= size; j += i)
					sieve[j] = false;
			}
		}
		for (int i = 2; i <= size; i++) {
			if (sieve[i] == true)
				System.out.print(i + " ");
		}
		scr.close();

	}

}
