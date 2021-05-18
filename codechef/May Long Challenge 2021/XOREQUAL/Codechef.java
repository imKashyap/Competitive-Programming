/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static long MOD = 1_000_000_007;
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n=Integer.parseInt(br.readLine());
		    long ans= fastPower(2, n-1, MOD);
		    System.out.println(ans);
		}
		br.close();
	}
	
	static long fastPower(long x, long y, long p){
    long res = 1;
    x = x % p; 
    if (x == 0)
      return 0; 
    while (y > 0){
      if ((y & 1) != 0)
        res = (res * x) % p;
      y = y >> 1; // y = y/2
      x = (x * x) % p;
    }
    return res;
  }
}

