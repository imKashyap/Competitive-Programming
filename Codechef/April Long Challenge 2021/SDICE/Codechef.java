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
		long t= Long.parseLong(br.readLine());
		while(t--!=0){
		    long n=Long.parseLong(br.readLine());
		    long mo4=n/4;
		    long rem=n%4;
		    long ans=0;
		    if(n==1)ans=20;
		    else if (n==2)ans=2*(6+5+4+3);
		    else if(n==3)ans=2*(6+5+4+3)+6+5+4;
		    else{
		        if(rem==0){
		            ans+=4*(6+5)*mo4;
		            ans+=4*4;
		        }
		        else if(rem==1){
		            ans+=4*(6+5)*mo4;
		            ans+=3*4;
		            ans+=6+5+4+3+2;
		        }
		        else if(rem==2){
		            ans+=4*(6+5)*mo4;
		            ans+=2*4;
		            ans+=2*(6+5+4+3);
		        }
		        else if(rem==3){
		            ans+=4*(6+5)*mo4;
		            ans+=4;
		            ans+=2*(6+5+4+3)+6+5+4;
		        }
		    }
		    System.out.println(ans);
		}
		br.close();
	}
}
