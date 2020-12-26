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
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                String line = br.readLine(); 
                String[] temp = line.trim().split("\\s+"); 
                int n=Integer.parseInt(temp[0]);
                int k=Integer.parseInt(temp[1]);
                int[] arr= new int[n];
                line = br.readLine(); 
                temp = line.trim().split("\\s+"); 
                for (int i = 0; i < n; i++) 
                    arr[i] = Integer.parseInt(temp[i]);
                int sum=0;
                for (int i = 0; i < n; i++)
                    sum+=arr[i];
                if(sum%k==0)
                    System.out.println("0");
                else System.out.println("1");
            }
            br.close();
		}
		catch(Exception e){
		    return;
		}
	}
}
