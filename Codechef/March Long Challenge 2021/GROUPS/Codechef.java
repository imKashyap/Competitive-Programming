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
		Scanner scr= new Scanner(System.in);
		int t= scr.nextInt();
		while(t--!=0){
		    int counta=0, countb=0;
		    String str= scr.next();
		    for(int i=0;i<str.length();i++){
		        if(str.charAt(i)=='1')
		            countb++;
		    }
		    for(int i=0;i<str.length()-1;i++){
		        if(str.charAt(i)=='1' && str.charAt(i+1)=='1')
		            counta++;
		    }
		    System.out.println(countb-counta);
		}
		scr.close();
	}
}

