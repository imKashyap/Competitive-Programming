class Solution {
    public void reverseString(char[] s) {
        int start=0, end=s.length-1;
        for (; start < end; start++, end--) {
            char temp=s[start];
            s[start] = s[end];
			s[end] = temp;
		}
        for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
    }
}
