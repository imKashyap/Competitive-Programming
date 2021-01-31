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
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n=Integer.parseInt(br.readLine());
		    String[] temp=br.readLine().split("\\s+");
		    int[] arr=new int[n];
		    int ocount=0,ecount=0;
		    for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(temp[i]);
                if(arr[i]%2==0)ecount++;
                else ocount++;
            }
            if(ocount<ecount)System.out.println(ocount);
            else System.out.println(ecount);
		}
		br.close();
	}
}
