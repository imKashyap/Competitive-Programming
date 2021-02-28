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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t--!=0){
		    String s=br.readLine();
		    int[] count=new int[26];
		    for (int i = 0; i < s.length(); i++) {
		    	int ch = Character.toUpperCase(s.charAt(i)) - 65;
			    count[ch]++;
	    	}
	    	int evens=0,ones=0;
	    	for(int i=0;i<26;i++){
	    	    if(count[i]==0)continue;
	    	    if(count[i]==1)ones++;
	    	    else{
	    	        if(count[i]%2==0)
	    	            evens+=count[i]/2;
	    	        else{
	    	            evens+=count[i]/2;
	    	            ones++;
	    	        }
	    	    }
	    	}
	    	if(evens<ones)System.out.println("NO");
	    	else System.out.println("YES");
		}
		br.close();
	}
}

