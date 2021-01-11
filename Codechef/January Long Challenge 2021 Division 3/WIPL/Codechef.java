/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			String line = br.readLine();
			String[] temp = line.trim().split("\\s+");
			int n = Integer.parseInt(temp[0]);
			int k = Integer.parseInt(temp[1]);
			LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
			int sum = 0;
			int[] h = new int[n];
			line = br.readLine();
			temp = line.trim().split("\\s+");
			for (int i = 0; i < n; i++) 
				h[i] = Integer.parseInt(temp[i]);
			Arrays.sort(h);
			h1.add(h[n - 1]);
			sum = h[n - 1];
			int z = -1;
			for (int i = n - 2; i >= 0; i--) {
				LinkedHashSet<Integer> h2 = new LinkedHashSet<Integer>();
				sum = sum + h[i];
				Iterator i1 = h1.iterator();
				while (i1.hasNext()) {
					int p = (int) (i1.next());
					h2.add(p);
					h2.add(h[i]);
					h2.add(p + h[i]);
					if (((p + h[i]) >= k) && ((sum - p - h[i]) >= k)) {
						z = n - i;
						break;
					}
					if (((h[i]) >= k) && ((sum - h[i]) >= k)) {
						z = n - i;
						break;
					}
				}
				if (z != -1) {
					break;
				}
				h1 = h2;
			}
			System.out.println(z);
		}
	}
}

