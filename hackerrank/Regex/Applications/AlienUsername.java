import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String[] names=new String[n];
        for(int i=0;i<n;i++){
            names[i]=br.readLine();
            Matcher m =Pattern.compile("^(_|\\.)[0-9]+[a-zA-Z]*_?$").matcher(names[i]);
            boolean isValid=m.matches();
            System.out.println(isValid?"VALID":"INVALID");
            
        }
        br.close();
    }
}
