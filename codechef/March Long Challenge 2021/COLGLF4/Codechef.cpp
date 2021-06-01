#include<iostream>
#define ll long long int
#include<vector>
#include<algorithm>

using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    ll n, e,c,po,pm,pk;
	    cin>>n>>e>>c>>po>>pm>>pk;
	    
	    vector<ll>sol;
	    vector<ll>kvec;
	    
	    for(int i=0;i<=n+1;i++)
	        kvec.push_back(i);
	    
	    for(ll m=0;m<=n;m++){
	        ll idx1= lower_bound(kvec.begin(), kvec.end(), (2*n-e-2*m))-kvec.begin();
	        ll idx2=upper_bound(kvec.begin(), kvec.end(), (c-3*m))-kvec.begin()-1;
	        if(idx2<idx1 || idx1==n+1)continue;
	        if(idx2==n+1 && idx2+3*m>c)continue;
	        
	        ll k;
	        if(pk>po)k=(idx1<(n-m)?idx1:(n-m));
	        else k=(idx2<(n-m)?idx2:(n-m));
	        
	        ll o=n-k-m;
	        if(k+2*m>=2*n-e && k+3*m<=c)
	            sol.push_back(po*o+pm*m+pk*k);
	    }
	    if(sol.size()==0)cout<<"-1"<<endl;
	    else{
	        ll min=sol[0];
	        for(ll i=0;i<sol.size();i++)
	            if(sol[i]<min)min=sol[i];
	        cout<<min<<endl;
	    }
	}
	return 0;
}

