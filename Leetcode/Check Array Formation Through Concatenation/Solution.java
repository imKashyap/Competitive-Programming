class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        boolean poss=true;
        for(int i=0;i<pieces.length;i++){
            int[] a=pieces[i];
            int j=0,k=0;
            boolean triggered=false;
            while(j<arr.length && k<a.length){
                if(arr[j]==a[k]){
                    triggered=true;
                    k++;   
                }
                else if(triggered)break;
                j++;
            }
            if(k!=a.length){
                poss=false;
                break;
            }
        }
        return poss;
    }
}
