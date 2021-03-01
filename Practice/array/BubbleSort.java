
import java.io.*;

public class BubbleSort{
    // time complexity: O(n^2).
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String line=br.readLine();
        String[] temp=line.trim().split("\\s+");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(temp[i]);
        boolean sorted=false;
        while(!sorted){
            sorted=true;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                    sorted=false;
                }
            }
        }
        StringBuffer sb = new StringBuffer(); 
        for (int m = 0; m < n; m++) 
            sb.append(arr[m] + " ");    
        System.out.println(sb); 
        br.close();
    }
}