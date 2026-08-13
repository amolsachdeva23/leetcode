class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prod=1;
        int p=1;
        int k=0;

        for(int i=0;i<n;i++){
            prod*=nums[i];
            if(nums[i]!=0)
            p*=nums[i];
            else
            k++;
        }
        for(int i=0;i<n;i++){
            if(k>=2) nums[i]=0;
            else if(k==1) {
                if(nums[i]==0)
                    nums[i]=p;
                else
                    nums[i]=0;
            }
            else{
                nums[i]=prod/nums[i];
            }
        }
        return nums;
    }
}