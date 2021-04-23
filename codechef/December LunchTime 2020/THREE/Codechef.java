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
		try{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                String s = br.readLine();
                int len=s.length();
                if(len<3){
                    System.out.println("0");
                    return;
                }
                int[] arr = new int[26];
                for (int i = 0; i < len; i++) {
			        int ch = s.charAt(i) - 97;
			        arr[ch]++;
		        }
		        int count=0, charLeft=len;
		        for(int i=0;i<26;i++){
		            if(arr[i]%2==0){
		                int palinPossible=arr[i]/2;
		                for(int j=palinPossible;j!=0;j--){
		                    if(charLeft>=j*3){
		                        count+=j;
		                        charLeft-=j*3;
		                        break;
		                    }
		                }
		            }   
		            else if(arr[i]!=1){
		                int palinPossible=(arr[i]-1)/2;
		                for(int j=palinPossible;j!=0;j--){
		                    if(charLeft>=j*3){
		                        count+=j;
		                        charLeft-=j*3;
		                        break;
		                    }
		                }
		                
		            }
		        }
		        System.out.println(count);
            }
            br.close();
		}
		catch(Exception e){
		    return;
		}
	}
}
