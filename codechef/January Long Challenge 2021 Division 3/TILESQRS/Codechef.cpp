
#include<bits/stdc++.h>
using namespace std;
#define fin  cin.ignore(numeric_limits<streamsize>::max(),'\n')
#define fout cout.flush()
#define fill(w,t) memset(w,t,sizeof(w))
#define google cout<<"Case #"<<countu<<": "
#define S(t) (ll)t.size()
#define bl '\n'
#define nl cout<<bl
#define cout1(a) cout<<a<<bl
#define cout2(a,b) cout<<a<<" "<<b<<bl
#define cout3(a,b,c) cout<<a<<" "<<b<<" "<<c<<bl
#define cout4(a,b,c,d) cout<<a<<" "<<b<<" "<<c<<" "<<d<<bl
#define print(azz,szz,ezz) for(ll i=szz;i<=ezz;i++){ cout<<azz[i]<<" "; }
#define rprint(azz,szz,ezz) for(ll i=szz;i>=ezz;i--){ cout<<azz[i]<<" "; }
#define input(azz,szz,ezz) sfor(pzz,szz,ezz) cin>>azz[pzz]
#define all(v) v.begin(),v.end()
#define ll long long
#define ldb long double
#define db double
#define ull unsigned long long
#define lb lower_bound
#define ub upper_bound
#define pb push_back
#define mk make_pair
#define pll pair<ll,ll>
#define pldb pair<ldb,ldb>
#define fi first
#define se second
#define vull vector<ull>
#define vll vector<ll>
#define vb vector<bool>
#define vldb vector<ldb>
#define vpll vector< pll >
#define vpldb vector< pldb >
#define pqmin priority_queue<ll,vector<ll>,greater<ll> >     //minheap
#define pq priority_queue<ll>                                //maxheap ll
#define pqpll priority_queue<pll>                            //maxheap pll
#define pqpllmin priority_queue<pll, vector<pll>, greater<pll> >   //minheap pll
#define mll map<ll,ll>
#define mldb map<ldb,ldb>
#define umll unordered_map<ll,ll>
#define sll set<ll>
#define usll unordered_set<ll>
#define sfor(i,azz,bzz) for (ll i = (azz); i <= (bzz); ++i)
#define rfor(i,bzz,azz) for (ll i = (bzz); i >= (azz); --i)
const ll mod = 1e9+7;
// const ll mod=998244353 ;
const ll maxn = 1e6+1;
const ll llmax = (1ll<<60);
const int intmax = (1<<30);
const ldb PI = 3.14159265358979323846264338327950288419716939937510582097494459230781640628620899863;
vll fact , ifact;
vll primes;
vll spf;

bool codechef(ll countu){
  ll n,q,k;
  cin>>n>>q>>k;
  ll res[n][n];
  ll r;
  fill(res,-1);
  cout<<1<<" "<<1<<" "<<1<<endl;
  fout;
  cin>>r;
  if(r==-1) return false;
  if(r<k)
  {
    res[0][0]=1;
    res[0][1]=1;
    res[1][0]=1;
    res[1][1]=0;
  }
  else if(r>k)
  {
    res[0][0]=0;
    res[0][1]=1;
    res[1][0]=1;
    res[1][1]=0;
  }
  else
  {
    bool check=false;
    ll ri=0,ci=1;
    sfor(i,0,3)
    {
      ll rj=0,cj=2;
      sfor(j,0,2)
      {
        k=r;
        cout<<1<<" "<<(rj%2)+1<<" "<<cj<<endl;
        fout;
        cin>>r;
        if(r==-1) return false;
        if(r>k)
        {
          if(n==2)
          {
            check=true;
            res[0][0]=0;
            res[0][1]=1;
            res[1][0]=1;
            res[1][1]=0;
            break;
          }
          k=r;
          cout<<1<<" "<<1<<" "<<1<<endl;
          fout;
          cin>>r;
          if(r==-1) return false;
          if(r<k)
          {
            check=true;
            res[0][0]=1;
            res[0][1]=1;
            res[1][0]=1;
            res[1][1]=0;
            break;
          }
          k=r;
          cout<<1<<" "<<1<<" "<<1<<endl;
          fout;
          cin>>r;
          if(r==-1) return false;
        }
        rj++;
      }
        if(check) break;
        ri++;
        k=r;
        cout<<1<<" "<<(ri%2)+1<<" "<<ci<<endl;
        fout;
        cin>>r;
        if(r==-1) return false;
        if(r>k)
        {
          if(n==2)
          {
            check=true;
            res[0][0]=0;
            res[0][1]=1;
            res[1][0]=1;
            res[1][1]=0;
            break;
          }
          k=r;
          cout<<1<<" "<<1<<" "<<1<<endl;
          fout;
          cin>>r;
          if(r==-1) return false;
          if(r<k)
          {
            check=true;
            res[0][0]=1;
            res[0][1]=1;
            res[1][0]=1;
            res[1][1]=0;
            break;
          }
          k=r;
          cout<<1<<" "<<1<<" "<<1<<endl;
          fout;
          cin>>r;
          if(r==-1) return false;
        }
    }
  }
  sfor(i,2,n-1)
  {
      if(res[i-1][0]!=0)
       {
      k=r;
      cout<<1<<" "<<i<<" "<<1<<endl;
      fout;
      cin>>r;
      if(r==-1) return false;
      res[i-1][0]^=1;
      if(r>k)
      {
        res[i][0]=1;
        res[i][1]=0;
      }
       }
       if(res[i-1][1]!=1)
       {
           k=r;
      cout<<1<<" "<<i<<" "<<2<<endl;
      fout;
      cin>>r;
      if(r==-1) return false;
      res[i-1][1]^=1;
      if(r>k)
      {
        res[i][0]=1;
        res[i][1]=0;
      }
       }
       if(res[i][0]!=-1) continue;
      ll cj=0;
      sfor(j,0,3)
      {
        k=r;
        cout<<1<<" "<<i+1<<" "<<(cj%2)+1<<endl;
        fout;
        cin>>r;
        if(r==-1) return false;
        if(r>k)
        {
          k=r;
          cout<<1<<" "<<i<<" "<<1<<endl;
          fout;
          cin>>r;
          res[i-1][0]^=1;
          if(r==-1) return false;
          if(r<k)
          {
            res[i][0]=1;
            res[i][1]=0;
            break;
          }
          k=r;
          cout<<1<<" "<<i<<" "<<1<<endl;
          fout;
          cin>>r;
          res[i-1][0]^=1;
          if(r==-1) return false;
        }
        cj++;
      }
  }
  sfor(i,2,n-1)
  {
        if(res[0][i-1]!=0)
        {
      k=r;
      cout<<1<<" "<<1<<" "<<i<<endl;
      fout;
      cin>>r;
      if(r==-1) return false;
      res[0][i-1]^=1;
      if(r>k)
      {
        res[0][i]=1;
        res[1][i]=0;
      }
        }
        if(res[1][i-1]!=1)
        {
            k=r;
      cout<<1<<" "<<2<<" "<<i<<endl;
      fout;
      cin>>r;
      if(r==-1) return false;
      res[1][i-1]^=1;
      if(r>k)
      {
        res[0][i]=1;
        res[1][i]=0;
      }      
        }
        if(res[0][i]!=-1) continue;
      ll rj=0;
      sfor(j,0,3)
      {
        k=r;
        cout<<1<<" "<<(rj%2)+1<<" "<<i+1<<endl;
        fout;
        cin>>r;
        if(r==-1) return false;
        if(r>k)
        {
            k=r;
          cout<<1<<" "<<1<<" "<<i<<endl;
          fout;
          cin>>r;
          res[0][i-1]^=1;
          if(r==-1) return false;
          if(r<k)
          {
            res[0][i]=1;
            res[1][i]=0;
            break;
          }
          k=r;
          cout<<1<<" "<<1<<" "<<i<<endl;
          fout;
          cin>>r;
          if(r==-1) return false;
          res[0][i-1]^=1;
        }
        rj++;
      }
  }
  sfor(i,2,n-1)
  {
    sfor(j,2,n-1)
    {
      if(res[i-1][j-1]!=0)
      {
        k=r;
          cout<<1<<" "<<i<<" "<<j<<endl;
          fout;
          cin>>r;
          if(r==-1) return false;
          res[i-1][j-1]^=1;
      }
      if(res[i-1][j]!=1)
      {
        k=r;
        cout<<1<<" "<<i<<" "<<j+1<<endl;
          fout;
          cin>>r;
          if(r==-1) return false;
          res[i-1][j]^=1;
      }
      if(res[i][j-1]!=1)
      {
        k=r;
        cout<<1<<" "<<i+1<<" "<<j<<endl;
          fout;
          cin>>r;
          if(r==-1) return false;
          res[i][j-1]^=1;
      }
     
      k=r;
      cout<<1<<" "<<i+1<<" "<<j+1<<endl;
      fout;
      cin>>r;
      if(r==-1) return false;
      if(r>k)
      {
        res[i][j]=0;
      }
      else
      {
        res[i][j]=1;
      }
    }
  }
  cout<<2<<endl;
  sfor(i,0,n-1)
  {
    sfor(j,0,n-1)
    {
      cout<<res[i][j]<<" ";
    }
    cout<<endl;
  }
  fout;
  cin>>r;
  if(r==-1) return false;
  return true;
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    srand(time(0));
     // freopen("input.txt","r",stdin);
    // freopen("output.txt","w",stdout);
    ll t=1;
    cin>>t;
    sfor(i,1,t)
        if(!codechef(i)) break;


    return 0;
}
