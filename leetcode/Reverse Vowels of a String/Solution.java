class Solution {
    public String reverseVowels(String s) {
        int start=0,end=s.length()-1;
        char[] str = s.toCharArray();
        while(start<end){
            char ch1=str[start];
            char ch2=str[end];
            if(isVowel(ch1) && isVowel(ch2)){
                char temp=str[start];
                str[start]=str[end];
                str[end]=temp;
                start++;
                end--;
            }
            else if(isVowel(ch1))
                end--;
            else if(isVowel(ch2))
                start++;
            else {
                start++;
                end--;
            }
        }
        s = String.valueOf(str);
        return s;
    }
    
    public boolean isVowel(char ch){
        return (ch=='A' || ch=='a'|| ch=='E' || ch=='e' || ch=='I' || ch=='i'|| ch=='O' || ch=='o'|| ch=='U' || ch=='u');
    }
}
