import java.io.*;
import java.util.*;
import java.util.regex.*;   

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Matcher IPv4Matcher = Pattern.compile(
            "(?:2(?:5[0-5]?|[0-4][0-9]?|[0-9])?|[0-1][0-9]{0,2}|[3-9][0-9]?)(?:\\.(?:2(?:5[0-5]?|[0-4][0-9]?|[0-9])?|[0-1][0-9]{0,2}|[3-9][0-9]?)){3}"
        ).matcher("");
        Matcher IPv6Matcher = Pattern.compile(
            "[0-9a-f]{1,4}(?::[0-9a-f]{1,4}){7}",
            Pattern.CASE_INSENSITIVE
        ).matcher("");
        int N = Integer.parseInt(reader.readLine());
         while (N-- > 0) {
            String address = reader.readLine().trim();
            IPv4Matcher.reset(address);
            if (IPv4Matcher.matches()) {
                System.out.println("IPv4");
                continue;
            }
            IPv6Matcher.reset(address);
            if (IPv6Matcher.matches()) {
                System.out.println("IPv6");
                continue;
            }
            System.out.println("Neither");
        }
        reader.close();
    }
}
