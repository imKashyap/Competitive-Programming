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
                int x=Integer.parseInt(temp[0]);
                int y=Integer.parseInt(temp[1]);
                int k=Integer.parseInt(temp[2]);
                int n=Integer.parseInt(temp[3]);
                // System.out.println(x);
                // System.out.println(y);
                // System.out.println(k);
                // System.out.println((x-y)%k);
                if((x-y)%(2*k)==0)
                    System.out.println("Yes");
                else 
                    System.out.println("No");
            }
            br.close();
		}
		catch(Exception e){
		    return;
		}
	}
}
