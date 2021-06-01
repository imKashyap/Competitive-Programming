package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Arena {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String[] temp = line.trim().split("\\s+");
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(temp[i]);
			Arrays.sort(arr);
			int count = 0;
			for (int i = 0; i < n;) {
				if (i != 0)
					count++;
				int j;
				for (j = i + 1; j < n; j++) {
					if (arr[j] == arr[i]) {
						if (i != 0)
							count++;
					} else
						break;
				}
				i = j;
			}
			System.out.println(count);
		}
		br.close();
	}

}
