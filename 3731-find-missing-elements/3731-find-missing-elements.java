class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int[] arr=new int[101];
            for(int i=0;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
            if(max<nums[i]) max=nums[i];
            arr[nums[i]]++;
        }
        // int minsum=(min*(min+1))/2;
        // int maxsum=(max*(max+1))/2;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=min;i<(max);i++){
             if(arr[i]==0) list.add(i);
        }
        return list;
    }
}