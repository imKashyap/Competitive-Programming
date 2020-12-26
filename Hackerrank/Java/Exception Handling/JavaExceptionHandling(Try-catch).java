import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scr=new Scanner(System.in);
        int a,b;
        try{
             a=scr.nextInt();
             b=scr.nextInt();
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
            return;
        }
        try{
            int d=a/b;
            System.out.println(d);
        }catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}