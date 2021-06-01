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
		int MOD=1000000007;
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String line= br.readLine();
        String[] temp= line.trim().split("\\s+");
        ArrayList<Integer> a= new ArrayList<>();
        long sum=0;
        for (String s:temp){
            int d=Integer.parseInt(s);
            a.add(d);
            sum=(sum+d+MOD)%MOD;
        }
        int q= Integer.parseInt(br.readLine());
        line= br.readLine();
        while(q--!=0){
	        sum=(2*sum)%MOD;
	        System.out.println(sum);
	    }
        br.close();
    }

}

