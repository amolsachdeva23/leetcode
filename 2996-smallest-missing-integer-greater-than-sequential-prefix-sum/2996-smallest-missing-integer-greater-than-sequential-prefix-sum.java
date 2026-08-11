class Solution {
    public int missingInteger(int[] nums) {
        int i=0;
        int sum=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1)
            sum+=nums[i];
            else break;
        }
       
        sum+=nums[i];
        i++;
        
        Set<Integer> set=new HashSet<>();
        for(int j=0;j<nums.length;j++){
            set.add(nums[j]);
        }
        if(!set.contains(sum)) return sum;
        while(true){
           if( !set.contains(sum)) return sum;
           sum++;
        }
    }
}