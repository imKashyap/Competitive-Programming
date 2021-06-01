#include <bits/stdc++.h>
using namespace std;
const int MAX = 10000000;
int prefix[MAX + 1];
void buildPrefix()
{
    bool prime[MAX + 1];
    memset(prime, true, sizeof(prime));
    for (int p = 2; p * p <= MAX; p++) {

        if (prime[p] == true) {

            for (int i = p * 2; i <= MAX; i += p)
                prime[i] = false;
        }
    }
    prefix[0] = prefix[1] = 0;
    for (int p = 2; p <= MAX; p++) {
        prefix[p] = prefix[p - 1];
        if (prime[p])
            prefix[p]++;
    }
}
 int query(int L, int R)
{
    return prefix[R] - prefix[L];
}
int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  int t;
  cin >> t;
  buildPrefix();
  while (t--) {
      int n;
      cin>>n;
      if(n==2)cout<<"1\n";
      else if(n==3||n==4)cout<<"2\n";
      else{
          int l = n / 2;
          int ans = query(l,n);
          cout<<ans+1<<"\n";
      }

  }
  return 0;
}
