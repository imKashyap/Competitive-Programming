import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargest {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line= br.readLine();
        String[] temp= line.trim().split("\\s+");
        int[] arr= new int[n];
        for(int i=0;i< temp.length;i++)
            arr[i]=Integer.parseInt(temp[i]);
        int k = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(i<k) pq.add(arr[i]);
            else{
                int peeked= pq.peek();
                if(peeked<arr[i]){
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> li= new ArrayList<>(pq);
        Collections.sort(li, Collections.reverseOrder());
        for (int ele: li) {
            System.out.print(ele+" ");
        }
        br.close();
    }
}

