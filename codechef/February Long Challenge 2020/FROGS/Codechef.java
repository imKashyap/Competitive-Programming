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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine());
        while(t--!=0){
            int n = Integer.parseInt(br.readLine()); 
            int[] w=new int [n];
            int[] l=new int [n];
            String line = br.readLine(); 
            String[] temp = line.trim().split("\\s+");
            for (int i = 0; i < n; i++) 
                w[i] = Integer.parseInt(temp[i]);
            line = br.readLine(); 
            temp = line.trim().split("\\s+"); 
            for (int i = 0; i < n; i++) 
                l[i] = Integer.parseInt(temp[i]);
            if(n==2){
                if(w[0]>w[1]){
                    if(l[0]==1)System.out.println("2");
                    else System.out.println("1");
                }
                else System.out.println("0");
            }
            else if(n==3){
                int a=0,ao=0,b=0,bo=0,c=0,co=0, ans=0;
                for(int i=0;i<n;i++){
                    if(w[i]==1)a=ao=i;
                    else if(w[i]==2)b=bo=i;
                    else c=co=i;
                }
                while(b<=a || c<=a ||c<=b){
                    while(b<=a){
                        b+=l[bo];
                        ans++;
                    }
                    while(c<=a || c<=b){
                        c+=l[co];
                        ans++;
                    }
                }
                System.out.println(ans);
            }
            else{
                int a=0,ao=0,b=0,bo=0,c=0,co=0,d=0,doo=0, ans=0;
                for(int i=0;i<n;i++){
                    if(w[i]==1)a=ao=i;
                    else if(w[i]==2)b=bo=i;
                    else if(w[i]==3)c=co=i;
                    else d=doo=i;
                }
                while(b<=a || c<=a ||c<=b || d<=a || d<=b || d<=c){
                    while(b<=a){
                        b+=l[bo];
                        ans++;
                    }
                    while(c<=a || c<=b){
                        c+=l[co];
                        ans++;
                    }
                    while(d<=a|| d<=b || d<=c){
                        d+=l[doo];
                        ans++;
                    }
                }
                System.out.println(ans);
            }
            
            
        }
        br.close();
	}
}

