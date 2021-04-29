package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class RedBlueBeans {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t--!=0){
            String line = br.readLine();
            String[] temp= line.trim().split("\\s+");
            int r =Integer.parseInt(temp[0]);
            int b =Integer.parseInt(temp[1]);
            int d =Integer.parseInt(temp[2]);
            if(d==0){
                if(r==b)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                continue;
            }
            else if( r==1 || b==1){
                if(Math.abs(r-b)<=d)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                continue;
            }
            int min= Math.min(r,b);
            int max= Math.max(r,b);
            int toTake=0;
            for(int i=0;true;i++){
                if(min==0){
                    System.out.println("NO");
                    break;
                }
                toTake= d+1;
                if(max<=toTake){
                    System.out.println("YES");
                    break;
                }
                min--;
                max-=toTake;
            }
        }
        br.close();
    }
}
