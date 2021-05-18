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
		    int x=0, o=0, u=0;
		    char[][] a= new char[3][3];
		    for(int i=0;i<3;i++){
		        String s=br.readLine();
		        for(int j=0;j<3;j++){
		            char ch= s.charAt(j);
		            a[i][j]=ch;
		            if(ch=='X')x++;
		            else if(ch=='O')o++;
		            else u++;
		        }
		    }
		    if(u==0){
		        if(x==5 && o==4){
		            boolean ow=false;
		            for(int i=0;i<3;i++)
		                if(a[i][0]=='O' && a[i][1]=='O' && a[i][2]=='O')ow=true;
		            for(int i=0;i<3;i++)
		                if(a[0][i]=='O' && a[1][i]=='O' && a[2][i]=='O')ow=true;
	                if((a[0][0]=='O' && a[1][1]=='O' && a[2][2]=='O') || (a[0][2]=='O' && a[1][1]=='O' && a[2][0]=='O'))ow=true;
	                if(ow)System.out.println("3");
	                else System.out.println("1");
		        }
		        else System.out.println("3");
		    }
		    else{
		        if(x-o!=1 && u%2==0){
		            System.out.println("3");
		            continue;
		        }
		        if(x!=o && u%2!=0){
		            System.out.println("3");
		            continue;
		        }
		        if(x>=3){
		            boolean xw=false, ow=false;
		            for(int i=0;i<3;i++){
		                if(a[i][0]=='X' && a[i][1]=='X' && a[i][2]=='X')xw=true;
		                if(a[i][0]=='O' && a[i][1]=='O' && a[i][2]=='O')ow=true;
		            }
		            for(int i=0;i<3;i++){
		                if(a[0][i]=='X' && a[1][i]=='X' && a[2][i]=='X')xw=true;
		                if(a[0][i]=='O' && a[1][i]=='O' && a[2][i]=='O')ow=true;
		            }
	                if((a[0][0]=='X' && a[1][1]=='X' && a[2][2]=='X') || (a[0][2]=='X' && a[1][1]=='X' && a[2][0]=='X'))xw=true;
	                if((a[0][0]=='O' && a[1][1]=='O' && a[2][2]=='O') || (a[0][2]=='O' && a[1][1]=='O' && a[2][0]=='O'))ow=true;
	                if(!ow && !xw)System.out.println("2");
	                else if(xw){
	                    if(ow)System.out.println("3");
	                    else if(x>o)System.out.println("1");
	                    else System.out.println("3");
	                }
	                else{
	                    if(x==o)System.out.println("1");
	                    else System.out.println("3");
	                   }     
		            }
		            else System.out.println("2");
		        }
		        
		    }
		br.close();
	}
}

