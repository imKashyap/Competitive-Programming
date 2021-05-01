import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0, sum=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        for(int e: nums){
            sum+=e;
            if(map.containsKey(sum-k))count+= map.get(sum-k);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
