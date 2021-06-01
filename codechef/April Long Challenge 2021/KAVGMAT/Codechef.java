/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		long t=Long.parseLong(br.readLine());
		while(t--!=0){
		    String line=br.readLine();
		    String[] temp=line.trim().split("\\s+");
		    long n=Long.parseLong(temp[0]);
		    long m=Long.parseLong(temp[1]);
		    long k=Long.parseLong(temp[2]);
		    double[][] mat = new double[(int)(n+1)][(int)(m+1)];
		    for(long i=0;i<=n;i++){
		        if(i!=0){
		            line=br.readLine();
		            temp=line.trim().split("\\s+");
		        }
		        for(long j=0;j<=m;j++){
		            if(i==0 || j==0)mat[(int)i][(int)j]=0;
		            else  mat[(int)i][(int)j] = Long.parseLong(temp[(int)(j-1)]);
		        }
		    }
		    for(long i=0;i<=n;i++){
		        double pre=0;
		        for(long j=0;j<=m;j++){
		            mat[(int)i][(int)j]+=pre;
		            pre=mat[(int)i][(int)j];
		        }
		    }
		    for(long j=0;j<=m;j++){
		        double pre=0;
		        for(long i=0;i<=n;i++){
		            mat[(int)i][(int)j]+=pre;
		            pre=mat[(int)i][(int)j];
		        }
		    }
		    long min= Math.min(n,m);
		    long ans=0;
		    for(long len=1;len<=min;len++){
		        for(long i=len;i<=n;i++){
		            for(long j=len;j<=m;j++){
		                if((mat[(int)i][(int)j]+mat[(int)(i-len)][(int)(j-len)]-mat[(int)i][(int)(j-len)]-mat[(int)(i-len)][(int)j])/(len*len)>=k)
		                    ans++;
		            }
		        }
		    }
		    System.out.println(ans);
		}
		br.close();
	}
	
}
