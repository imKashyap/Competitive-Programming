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
		int t=Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n=Integer.parseInt(br.readLine());
		    int[] a=new int[n];
		    String line=br.readLine();
		    String[] temp=line.trim().split("\\s+");
		    int i=0;
		    for(;i<n;i++)
		        a[i]=Integer.parseInt(temp[i]);
		    Arrays.sort(a);
		    int sum=0;
		    for(i=0;i<n;i++){
		        if(a[i]>i+1)break;
		        sum+=i-a[i]+1;
		    }
		    if(i!=n)System.out.println("Second");
		    else {
		        if(sum%2==0)System.out.println("Second");
		        else System.out.println("First");
		    }
		}
		br.close();
	}
}
