/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t= Integer.parseInt(br.readLine());
		while(t--!=0){
		    String line= br.readLine();
		    String[] temp=line.trim().split("\\s+");
		    int r=Integer.parseInt(temp[0]);
		    int c=Integer.parseInt(temp[1]);
		    int x=Integer.parseInt(temp[2]);
		    int[][] a= new int[r][c];
		    int[][] b= new int[r][c];
		    takeInput(a, r,c);
		    takeInput(b, r,c);
		    if(r<x && c<x)        
		        System.out.println(compareArrays(a, b,r,c)?"Yes":"No");
		    else if(r<x){
		        for(int i=0;i<r;i++){
	                for(int j=0;j<c-x+1;j++){
	                    if(a[i][j]==b[i][j])continue;
	                    int diff=b[i][j]-a[i][j];
	                    a[i][j]+=diff;
	                    for(int k=1;k<x;k++)
	                        a[i][j+k]+=diff;
	               }
	            }
	            System.out.println(compareArrays(a, b,r,c)?"Yes":"No");
		    }
		    else if(c<x){
		        for(int i=0;i<c;i++){
	                for(int j=0;j<r-x+1;j++){
	                    if(a[j][i]==b[j][i])continue;
	                    int diff=b[j][i]-a[j][i];
	                    a[j][i]+=diff;
	                    for(int k=1;k<x;k++)
	                        a[j+k][i]+=diff;
	               }
	            }
	            System.out.println(compareArrays(a, b,r,c)?"Yes":"No");
		    }
		    else{
		        for(int i=0;i<r;i++){
	                for(int j=0;j<c-x+1;j++){
	                    if(a[i][j]==b[i][j])continue;
	                    int diff=b[i][j]-a[i][j];
	                    a[i][j]+=diff;
	                    for(int k=1;k<x;k++)
	                        a[i][j+k]+=diff;
	               }
	            }
	            for(int i=0;i<c;i++){
	                for(int j=0;j<r-x+1;j++){
	                    if(a[j][i]==b[j][i])continue;
	                    int diff=b[j][i]-a[j][i];
	                    a[j][i]+=diff;
	                    for(int k=1;k<x;k++)
	                        a[j+k][i]+=diff;
	               }
	            }
	             System.out.println(compareArrays(a, b,r,c)?"Yes":"No");
		    }
		}
		br.close();
	}
	
	public static void takeInput(int[][] arr, int r, int c)throws java.lang.Exception{
	    for(int i=0;i<r;i++){
	        String line= br.readLine();
		    String[] temp=line.trim().split("\\s+");
		    for(int j=0;j<c;j++)
		        arr[i][j]=Integer.parseInt(temp[j]);
	    }
	}
	
	public static boolean compareArrays(int[][] a, int[][] b, int r, int c) {
	    boolean flag=true;
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            if(a[i][j]!=b[i][j]){
	                flag=false;
	                break;
	            }
	        }
	    }
	    return flag;
	}
}

