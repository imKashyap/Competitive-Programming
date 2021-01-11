#include <bits/stdc++.h>
#define int long long int
using namespace std;
int32_t main()
{
    int t;
    cin >> t;
    while (t--) {
        int n, x, y;
        cin >> n >> x >> y;
        int a[n], s = 0, inti = 0;
        vector<int> v1, v2;
        for (int i = 0; i < n; i++) {
            cin >> a[i];
            if (x > a[i]) {
                v1.push_back(a[i]);
                s += a[i];
            }
            else if (y < a[i])
                v2.push_back(a[i]);
        }
        if ((v1.size() + v2.size()) == n) {
            if (s < x) {
                inti = 1;
                cout << -1 << endl;
            }
        }
        int cou = 0;
        if (inti == 0) {
            for (int i = 0; i < n; i++) {
                cou += a[i];
                if ((cou >= x) && (cou <= y)) {
                    inti = 1;
                    cout << 0 << endl;
                    break;
                }
            }
        }
        if (inti == 0) {
            int end = 0, bit, temp;
            for (int i = 0; i < n; i++) {
                end += a[i];
                if (end > y) {
                    bit = i;
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if ((x <= a[i]) && (a[i] <= y)) {
                    inti = 1;
                    cout << 1 << endl;
                    break;
                }
            }
            if (inti == 0) {
                for (int i = bit; i < n; i++) {
                    if (a[i] <= y) {
                        for (int j = 0; j <= bit; j++) {
                            temp = a[i];
                            for (int k = 0; k < n; k++) {
                                if (k != j && k != i)
                                    temp = temp + a[k];
                                if ((x <= temp) && (temp <= y)) {
                                    inti = 1;
                                    cout << 1 << endl;
                                    break;
                                }
                            }
                            if (inti == 1)
                                break;
                        }
                    }
                    if (inti == 1)
                        break;
                }
            }
        }
        if (inti == 0) {
            cout << 2 << endl;
        }
    }
    return 0;
}

