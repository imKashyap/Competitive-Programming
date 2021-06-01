package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindK {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t--!=0){
            long n=Long.parseLong(br.readLine());
            long ans=(long)(Math.log(n)/Math.log(2));
            System.out.println((long)Math.pow(2,ans)-1);
        }
        br.close();
    }
}
