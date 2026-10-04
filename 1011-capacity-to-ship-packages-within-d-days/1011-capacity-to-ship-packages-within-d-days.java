class Solution {
    public boolean canShip(int capacity,int[] weight,int d ){
        int days=1;
        int load=0;
        for(int i=0;i<weight.length;i++){
            if(load+weight[i]>capacity){//no equals as the shipment can fit and no need to start a new day
            
                days++;
                load=weight[i];
            }
            else{
                load+=weight[i];
            }
        }
        return (days<=d);
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            if(max<weights[i]) max=weights[i];
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
           int  mid=low+(high-low)/2;
            if(canShip(mid,weights,days)){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
}