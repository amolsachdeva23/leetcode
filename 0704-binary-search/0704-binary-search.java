class Solution {
    public int search(int[] nums, int target) {
       return helper(0,nums.length-1,target,nums); 
    }
    public int helper(int i,int j,int k,int[] arr){
        if(i>j ) return -1;
        int mid=i+(j-i)/2;
        if(k<arr[mid]) return helper(i,mid-1,k,arr);
        else if(k>arr[mid]) return helper(mid+1,j,k,arr);
        else return mid;
    }
}