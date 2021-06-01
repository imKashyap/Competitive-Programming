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
            String line = br.readLine();
            String[] temp= line.trim().split("\\s+");
            long n =Long.parseLong(temp[0]);
            long w =Long.parseLong(temp[1]);
            long wr =Long.parseLong(temp[2]);
            long[] arr =new long[(int)n];
            line = br.readLine();
            temp= line.trim().split("\\s+");
            Map<Long, Long> mp= new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(temp[i]);
                if (mp.containsKey(arr[i]))
                    mp.put(arr[i], mp.get(arr[i]) + 1);
                else mp.put(arr[i],(long)1);
            }
            if(wr>=w){
                System.out.println("YES");
                continue;
            }
            w-=wr;
            for(int i=0;i<n;i++){
                if(mp.get(arr[i])>=2){
                    long count= mp.get(arr[i]);
                    if(count%2==0) w-= count*arr[i];
                    else w-= (count-1)*arr[i];
                    mp.put(arr[i],(long)0);
                }
                if(w<=0)break;
            }
            if(w<=0)
                System.out.println("YES");
            else System.out.println("NO");
        }
        br.close();
	}
}

