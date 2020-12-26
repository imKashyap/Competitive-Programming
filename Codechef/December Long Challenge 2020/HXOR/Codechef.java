

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
            long t = Long.parseLong(br.readLine());
            while(t--!=0){
                // int n = Integer.parseInt(br.readLine()); 
                // int x = Integer.parseInt(br.readLine()); 
                String line = br.readLine(); 
                String[] tem = line.trim().split("\\s+"); 
                int n=Integer.parseInt(tem[0]);
                int x=Integer.parseInt(tem[1]);
                long[] a= new long[10000000];
                long z=0;
                line = br.readLine(); 
                String[] temp = line.trim().split("\\s+"); 
                for (int i = 0; i < n; i++) 
                    a[i] = Long.parseLong(temp[i]);
                int i=0;
                for(long k=x;k>0 && i<n-1;k--){
                    boolean flag=false;
                    double p= Math.log(a[i])/Math.log(2);
                    long res=(long)Math.pow(2,p);
                    a[i]=a[i]^res;
                    for(int j=i+1;j<n;j++){
                        if((a[j]^res)<a[j]){
                            a[j]=a[j]^res;
                            flag=true;
                            break;
                        }
                    }
                    if(!flag)
                        a[n-1]^=res;
                    for(;a[i]<=0;i++); 
                    z=k+1;
                }
                    if(n<3 && z%2>0 && z>0){
                        a[n-1]=a[n-1]^1;
                        a[n-2]=a[n-2]^1;
                        
                }
                StringBuffer sb = new StringBuffer(); 
                for (int m = 0; m < n; m++) 
                    sb.append(a[m] + " ");    
                System.out.println(sb); 
            }
            br.close();
		}
		catch(Exception e){
		    return;
		}
		
	}
}
