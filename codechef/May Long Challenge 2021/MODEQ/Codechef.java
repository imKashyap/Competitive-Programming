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
		long t= Long.parseLong(br.readLine());
		while(t--!=0){
		    String line= br.readLine();
		    String[] temp= line.trim().split("\\s+");
		    long n= Long.parseLong(temp[0]);
		    long m= Long.parseLong(temp[1]);
		    long ans=0;
		    long[] arr=new long[(int)(n+1)];
		    Arrays.fill(arr,1);
		    for(long i=2;i<=n;i++){
		        long a=m%i;
		        ans+=arr[(int)a];
		        for(long j=a;j<=n;j+=i)arr[(int)j]++;
		    }
		    System.out.println(ans);
		}
		br.close();
	}
}

