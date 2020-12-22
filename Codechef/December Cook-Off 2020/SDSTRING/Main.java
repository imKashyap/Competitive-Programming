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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String s=sc.next();
		    int c1=0,c2=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='0')
		            c1++;
		        else c2++;
		    }
		    if((s.length()%2)!=0 || c1==0 || c2==0)
		        System.out.println(-1);
		    else if(c1==c2){
		        System.out.println(0);
		    }
		    else{
		        if(c1<c2){
		            System.out.println((s.length()/2)-c1);
		        }
		        else{
		            System.out.println((s.length()/2)-c2);
		        }
		    }
		}
	}
}
