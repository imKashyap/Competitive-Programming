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
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while (t-- != 0) {
				int n = Integer.parseInt(br.readLine());
				long pos=0;
				long neg=0;
				while(n--!=0){
				    String line = br.readLine();
				    String[] temp = line.trim().split("\\s+");
				    int m = Integer.parseInt(temp[0]);
				    long[] arr=new long[m];
				    for(int i=0;i<m;i++){
				        arr[i]= Integer.parseInt(temp[i+1]);
				        if(arr[i]>0)pos++;
				        else neg++;
				    }
				}
				System.out.println(pos*neg);
			}

		} catch (Exception e) {
			return;
		}
	}
}

