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
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while(t--!=0){
		    long c=Long.parseLong(br.readLine().trim());
		    long d=(long)Math.pow(2,(long)(Math.log(c) / Math.log(2)+1));
		    long a=d/2-1;
		    long b=a^c;
		    System.out.println(a*b);
		}
		br.close();
	}
}
