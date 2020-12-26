class Codechef{

	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int t = Integer.parseInt(br.readLine());
	    while(t-->0){
	        int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
                String p = br.readLine();
		res(s, p);
	    }
	}
	static void res(String s, String p){
		int n = s.length();
		int s_z=0; int s_o=0;
		int p_z=0; int p_o=0;
		char ss[] = s.toCharArray(); 
		char pp[] = p.toCharArray(); 
		for(int i=0; i<n; i++){
			if(ss[i]=='1'){
				s_o++;
			}
			else if(ss[i]=='0'){
				s_z++;
			}
			if(pp[i]=='1'){
				p_o++;
			}
			else{
				p_z++;
			}
		}
		if((s_o != p_o) || (s_z!=p_z)){
			System.out.println("No");
			return;
		}
		int i=0; int one=0;
		int x=0, y=0;
		ArrayList<Integer> al = new ArrayList<>();
		while(i<n){
			if(ss[i]=='1' && pp[i]!='1'){
				one++;
				// x = i;
				al.add(i);
			}
			else if(ss[i]=='0' && pp[i]!='0'){
				if(one > 0){
					one--;
					char temp = ss[i];
			        ss[i] = ss[al.get(x)];
			        ss[al.get(x)] = temp;
			        x++;
				}
				else{
					System.out.println("No");
					return;
				}
			}			
			i++;
		}
		if(one > 0){
			System.out.println("No");
			return;
		}
		else{
			for(int g=0; g<n; g++){
				if(ss[g] != pp[g]){
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
	}
}
