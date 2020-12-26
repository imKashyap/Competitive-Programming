package myPrograms.strings;

import java.util.Scanner;

public class DnaSequence {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String input = scr.next();
		int[] repeat = new int[4];
		int largest = 0;
		char lastChar = input.charAt(0);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (i > 0)
				lastChar = input.charAt(i - 1);
			if (ch == 'A') {
				if (ch != lastChar)
					repeat[0] = 1;
				else
					repeat[0]++;
				if (repeat[0] > largest)
					largest = repeat[0];
			} else if (ch == 'C') {
				if (ch != lastChar)
					repeat[1] = 1;
				else
					repeat[1]++;
				if (repeat[1] > largest)
					largest = repeat[1];
			} else if (ch == 'G') {
				if (ch != lastChar)
					repeat[2] = 1;
				else
					repeat[2]++;
				if (repeat[2] > largest)
					largest = repeat[2];
			} else {
				if (ch != lastChar)
					repeat[3] = 1;
				else
					repeat[3]++;
				if (repeat[3] > largest)
					largest = repeat[3];
			}
		}
		System.out.println(largest);
		scr.close();

	}

}
