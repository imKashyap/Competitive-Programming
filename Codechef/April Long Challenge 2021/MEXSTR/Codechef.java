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
		    String s=br.readLine();
		    boolean hasZero=false;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='0'){
		            hasZero=true;
		            break;
		        }
		    }
		    if(hasZero)
		        System.out.println(checkNoSubsequence(s));
		    else System.out.println("0");
		}
		br.close();
	}
	
	public static String checkNoSubsequence(String str){
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (true) {
            String s1 = q.peek();
            q.remove();
            if(!isSubSequenceFound(s1,str))
                return s1;
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
	}
	
	  private static boolean isSubSequenceFound(String str1, String str2){
        int j = 0;
        for(int i = 0; i < str2.length(); i++){
        if(str1.charAt(j) == str2.charAt(i))
            ++j;
        if(j == str1.length())
            return true;
    }
    return false;
  }
}
