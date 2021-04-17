import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String[] sen=new String[n];
        for(int i=0;i<n;i++)
            sen[i]=br.readLine();
        int q= Integer.parseInt(br.readLine());
        String[] srch=new String[q];
        for(int i=0;i<q;i++)
            srch[i]=br.readLine();
        for(int i=0;i<q;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                Matcher m = Pattern.compile("\\w"+srch[i]+"\\w").matcher(sen[j]);
                while (m.find()) 
                    count++;
            }
            System.out.println(count);
        }
        br.close();
    }
}
