import java.util.*;
public class Codechef {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = s.nextInt();
            }
            int[] df=new int[n];
            boolean flag=false;
            for(int i=0;i<n-1;i++)
            {
                df[i]=arr[i+1]-arr[i];
                if(df[i]>0)
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
                System.out.println("YES");
            else {
                System.out.println("NO");
            }
        }
    }
}
