/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n=Integer.parseInt(br.readLine());
		    String line = br.readLine(); 
            String[] s = line.trim().split("\\s+");
            HashMap<String, ArrayList<Character>> names = new HashMap<String, ArrayList<Character>>();
            ArrayList<String> namesCopy = new ArrayList<String>();
            for(int i=0;i<n;i++){
                String ele=s[i];
                String sub=ele.substring(1);
                if(names.get(sub)!=null)
                    names.get(sub).add(ele.charAt(0));
                else{
                    ArrayList<Character> c = new ArrayList<Character>();
                    namesCopy.add(sub);
                    c.add(ele.charAt(0));
                    names.put(sub,c);
                }
            }
            int ans=0;
            for(int i=0;i<names.size();i++){
                List<Character> t1=names.get(namesCopy.get(i));
                for(int j=i+1;j<names.size();j++){
                    List<Character> copy = new ArrayList<Character>(t1);
                    List<Character> t2=names.get(namesCopy.get(j));
                    copy.addAll(t2);
                    int temp=countDistinct(copy);
                    ans+=(temp-t1.size())*(temp-t2.size());
                }
            }
            System.out.println(ans*2);
        }
		br.close();
	}
	
	public static int countDistinct(List<Character> letters){
	    Set<Character> hSet = new HashSet<Character>(); 
        for (char x : letters) 
            hSet.add(x);
        //System.out.println(hSet.size());
        return hSet.size();
	}
}

