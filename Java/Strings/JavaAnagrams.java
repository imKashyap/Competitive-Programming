import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())
        return false;
        int[] arr1 =new int[26];
        int[] arr2 =new int[26];
        for(int i=0;i<a.length();i++){
            int ch1=Character.toUpperCase(a.charAt(i))-65;
            int ch2=Character.toUpperCase(b.charAt(i))-65;
            arr1[ch1]++;
            arr2[ch2]++;
        }
        boolean isAnagram=true;
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                isAnagram=false;
                break;
            }
        }
        return isAnagram;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
