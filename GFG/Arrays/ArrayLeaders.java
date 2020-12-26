
import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayLeaders {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t,n,max,i,j;
		t=Integer.parseInt(br.readLine());
		while(t>0){
		    n=Integer.parseInt(br.readLine());
		    int[] a=new int[n];
		    String line=br.readLine();
		    String[] str=line.split(" ");
		    for(i=0;i<n;i++){
		        a[i]=Integer.parseInt(str[i]);
		    }
		    int[] b=new int[n];
		    max=a[n-1];j=0;
		    b[j]=max;
		    for(i=n-2;i>=0;i--){
		        if(max<=a[i]){
		            b[++j]=a[i];
		            max=a[i];
		        }
		    }
		    StringBuffer sb=new StringBuffer();
		    for(i=j;i>=0;i--){
		        sb.append(b[i]+" ");
		    }
		    t--;
		    System.out.println(sb);
		}
	}
}
