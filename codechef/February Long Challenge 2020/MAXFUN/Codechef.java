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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n=Integer.parseInt(br.readLine());
		    String line = br.readLine(); 
            String[] temp = line.trim().split("\\s+");
            long[] arr= new long[n];
            for (int i = 0; i < n; i++) 
                arr[i] = Long.parseLong(temp[i]);
            Arrays.sort(arr);
            long max=arr[n-1]-arr[0];
            max*=2;
            System.out.println(max);
		}
		br.close();
	}
}

