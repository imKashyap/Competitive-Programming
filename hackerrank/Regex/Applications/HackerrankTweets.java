import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final String KEY = "hackerrank";
        Scanner in = new Scanner(System.in);
        Matcher matcher = Pattern.compile(KEY, Pattern.CASE_INSENSITIVE).matcher("");
        //Count the tweets with KEY in it
        int count = 0;
        for(int N = Integer.parseInt(in.nextLine()); N > 0; --N) {
            String tweet = in.nextLine();
            matcher.reset(tweet);
            count += matcher.find() ? 1 : 0;
        }
        //Output count
        System.out.println(count);
    }
}