class Solution {
    public int longestSubsequence(int[] nums) {
        int total=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
              total^=nums[i];
        }
        if(total!=0) return n;
        else{
            for(int i=0;i<n;i++){
                if(nums[i]!=0) return n-1;
            }
        }
        return 0;
    }
// total XOR = remaining XOR ^ x

// 0 = remaining XOR ^ x

// remaining XOR = x
}