import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<=1)return nums;
        Deque<Integer> dq =new LinkedList<>();
        int[] ans= new int[nums.length-k+1];
        int i=0;
        for(;i<nums.length;i++){
            if(i>=k){
                ans[i - k] = nums[dq.peekFirst()];
				while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
					dq.removeFirst();
				}
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
                dq.removeLast();
           dq.addLast(i); 
        }
        ans[i-k]=nums[dq.peekFirst()];
        return ans;
    }
}
