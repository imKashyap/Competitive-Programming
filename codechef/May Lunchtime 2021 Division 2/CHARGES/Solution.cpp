#include<bits/stdc++.h>
#define ll long long
using namespace std;

void sol()
{
 ll t;
 cin>>t;
 while(t--)
 {
  ll n,k,ans=0;
  cin>>n>>k;
  string s;
  cin>>s;
  vector<ll> v(k);
  for(ll i=0;i<k;i++)
  {
   cin>>v[i];
   v[i]--;
  }
  for(ll i=0;i<n-1;i++)
  {
   if(s[i]==s[i+1])
   ans+=2;
   else
   ans++;
  }
  //cout<<ans<<" ";
  for(ll i=0;i<k;i++)
  {
   //s[v[i]]='1'-s[v[i]];
   if(s[v[i]]=='1')
   s[v[i]]='0';
   else
   s[v[i]]='1';
   //cout<<s<<" ";
   int in=v[i];
   if(v[i]>0)
   {
    if(s[in]==s[in-1])
    ans++;
    else
    ans--;
   }
   if(v[i]<n-1)
   {
    if(s[in]==s[in+1])
    ans++;
    else
    ans--;
   }
   cout<<ans<<endl;
  }
 }
}
int main()
{
 #ifndef ONLINE_JUDGE
 freopen("input.txt", "r", stdin);
 freopen("output.txt", "w", stdout);
 #endif
    sol();
 return 0;
}
