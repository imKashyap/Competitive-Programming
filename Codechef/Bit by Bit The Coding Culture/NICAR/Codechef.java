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
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int n = Integer.parseInt(br.readLine());
		int[] c = new int[n];
		String line = br.readLine();
		String[] temp = line.trim().split("\\s+");
		for (int i = 0; i < n; i++) 
			c[i] = Integer.parseInt(temp[i]);
		int ni=0;
		for(int i=1;i<n;i++){
		    if(c[i-1]>ni)ni=c[i-1];
		    c[i]=c[i]+ni;
		}
		StringBuffer sb = new StringBuffer(); 
        for (int m = 0; m < n; m++) 
            sb.append(c[m] + " "); 
        System.out.println(sb); 
        br.close();
		}
		catch(Exception e){
		    return;
		}
	}
}

