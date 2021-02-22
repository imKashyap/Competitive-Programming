class Solution {
    public int brokenCalc(int X, int Y) {
        if(X>Y)return X-Y;
        else if(X==Y)return 0;
        int ans = 0;
        while (X < Y) {
            ans++;
            if (Y % 2 > 0) Y++;
            else Y /= 2;
        }
        return X - Y + ans;
    }
}
