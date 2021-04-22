package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TitForTat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			String line = br.readLine();
			String[] temp = line.trim().split("\\s+");
			int n = Integer.parseInt(temp[0]);
			int k = Integer.parseInt(temp[1]);
			line = br.readLine();
			temp = line.trim().split("\\s+");
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(temp[i]);
			int i = 0;
			while (true) {
				if (k <= 0)
					break;
				if (i >= n - 1)
					break;
				while (i < n - 1 && arr[i] == 0) {
					i += 1;
					if (i >= n - 1)
						break;
				}
				arr[i] -= 1;
				arr[n - 1] += 1;
				k -= 1;
			}
			StringBuffer sb = new StringBuffer();
			for (i = 0; i < n; i++)
				sb.append(arr[i] + " ");
			System.out.println(sb.toString().trim());
		}
		br.close();
	}

}

