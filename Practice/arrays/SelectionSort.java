import java.io.*;
public class SelectionSort {
     // time complexity: O(n^2).
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String line=br.readLine();
        String[] temp=line.trim().split("\\s+");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(temp[i]);
        for(int i=0;i<n;i++){
            int min=arr[i];
            int minId=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minId=j;
                }
            }
            int t=arr[i];
            arr[i]=min;
            arr[minId]=t;
        }
        StringBuffer sb = new StringBuffer(); 
        for (int m = 0; m < n; m++) 
            sb.append(arr[m] + " ");    
        System.out.println(sb); 
        br.close();
    }
}
