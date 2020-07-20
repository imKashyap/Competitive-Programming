import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] arr){
        elements=arr;
    }

    void computeDifference(){
        int[] num=elements;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) { 
                if (num[i] > num[j]) {
                   int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        maximumDifference=num[num.length-1]-num[0];
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}