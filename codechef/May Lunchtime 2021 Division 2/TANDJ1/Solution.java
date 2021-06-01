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
		int t= Integer.parseInt(br.readLine());
		while(t--!=0){
		    String[] temp=br.readLine().trim().split("\\s+");
		    int a=Integer.parseInt(temp[0]);
		    int b=Integer.parseInt(temp[1]);
		    int c=Integer.parseInt(temp[2]);
		    int d=Integer.parseInt(temp[3]);
		    int k=Integer.parseInt(temp[4]);
		    int req=Math.abs(a-c)+Math.abs(b-d);
		    if(req>k)System.out.println("NO");
		    else if(k==req || (k-req)%2==0)System.out.println("YES");
		    else System.out.println("NO");
		}
		br.close();
	}
}
