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
    	 int t= Integer.parseInt(br.readLine());
        while(t--!=0){
            int l= Integer.parseInt(br.readLine());
            String s= br.readLine();
            int good=0,bad=0, i=0;
            for(;i<l;i++) {
                if (s.charAt(i) == '1') good++;
                else bad++;
                if (good >= bad) {
                    System.out.println("YES");
                    break;
                }
            }
            if (i==l ) {
                if (good >= bad)
                    System.out.println("YES");
                else System.out.println("NO");
            }
        }
        br.close();
	}
}

