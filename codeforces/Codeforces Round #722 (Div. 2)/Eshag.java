package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eshag {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			String[] tmp = br.readLine().trim().split("\\s+");
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = Integer.parseInt(tmp[i]);
			int s = a[0];
			for (int i = 1; i < n; i++) {
				if (a[i] < s)
					s = a[i];
			}
			int c = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] == s)
					c++;
			}
			System.out.println(n - c);
		}
		br.close();
	}

}

