import java.io.*;

public class InsertionSort {
    // time complexity: O(n^2).
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String line=br.readLine();
        String[] temp=line.trim().split("\\s+");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(temp[i]);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j!=0;j--){
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
                else break;
            }
        }
        StringBuffer sb = new StringBuffer(); 
        for (int m = 0; m < n; m++) 
            sb.append(arr[m] + " ");    
        System.out.println(sb); 
        br.close();
    }
}
