/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while (t-- != 0) {
				String line = br.readLine();
				String[] temp = line.trim().split("\\s+");
				int n = Integer.parseInt(temp[0]);
				int m = Integer.parseInt(temp[1]);
				int[] a = new int[n];
				int[] b = new int[m];
				TreeSet<Integer> h1=new TreeSet<Integer>();
				Stack<Integer> s1=new Stack<Integer>();
				line = br.readLine();
				temp = line.trim().split("\\s+");
				for (int i = 0; i < n; i++) {
					a[i] = Integer.parseInt(temp[i]);
				}
				line = br.readLine();
				temp = line.trim().split("\\s+");
				for (int i = 0; i < m; i++) {
					b[i] = Integer.parseInt(temp[i]);
				}
				h1.add(0);
				s1.push(0);
				for(;!s1.isEmpty();){
				    int x=(int)(s1.pop());
				    for (int i = 0; i < n; i++) {
				        int y=a[i];
				        if(!h1.contains(x|y)){
				            h1.add(x|y);
				            s1.push(x|y);
				        }
				    }
				    for (int i = 0; i < m; i++) {
				        int y=b[i];
				        if(!h1.contains(x&y)){
				            h1.add(x&y);
				            s1.push(x&y);
				        }
				    }
				    
				}
				System.out.println(h1.size());
				
			}

		} catch (Exception e) {
			return;
		}
	}
}

