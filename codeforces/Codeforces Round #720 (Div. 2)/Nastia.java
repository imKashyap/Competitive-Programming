package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nastia {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t--!=0){
            String line = br.readLine();
            String[] temp= line.trim().split("\\s+");
            long a =Long.parseLong(temp[0]);
            long b =Long.parseLong(temp[1]);
            if(a==1 && b==1 ) System.out.println("NO");
            else if (a==b && a!=1){
                System.out.println("YES");
                System.out.println(a+" "+(2*a*b-b)+" "+2*a*b);
            }
            else if(a==1){
                System.out.println("YES");
                System.out.println(a+" "+(2*b-a)+" "+2*a*b);
            }
            else if(b==1) System.out.println("NO");
            else if(a>b){
                System.out.println("YES");
                System.out.println(a+" "+(2*a*b-a)+" "+2*a*b);
            }
            else if(b>a){
                System.out.println("YES");
                System.out.println(a+" "+(a*b-a)+" "+a*b);
            }

        }
        br.close();
    }
}
