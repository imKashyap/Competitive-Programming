/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			String line = br.readLine();
			String[] temp = line.trim().split("\\s+");
			int n = Integer.parseInt(temp[0]);
			int m = Integer.parseInt(temp[1]);
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			int sum1 = 0, sum2 = 0;
			line = br.readLine();
			temp = line.trim().split("\\s+");
			for (int i = 0; i < n; i++) {
				arr1[i] = Integer.parseInt(temp[i]);
				sum1 += arr1[i];
			}

			line = br.readLine();
			temp = line.trim().split("\\s+");
			for (int i = 0; i < m; i++) {
				arr2[i] = Integer.parseInt(temp[i]);
				sum2 += arr2[i];
			}
			if (sum1 > sum2) {
				System.out.println(0);
				continue;
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int count = 0;
			int j = m - 1;
			for (int i = 0; i < n; i++) {
				sum1 = sum1 - arr1[i];
				sum2 = sum2 - arr2[j];
				sum1 = sum1 + arr2[j];
				sum2 = sum2 + arr1[i];
				count++;
				j--;
				if (sum1 > sum2 || j < 0) {
					break;
				}
			}
			if (sum1 > sum2) {
				System.out.println(count);
			} else {
				System.out.println(-1);
			}
		}
	}
}
