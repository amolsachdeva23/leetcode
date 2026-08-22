class Solution {
    public boolean checkDivisibility(int n) {
        int pod=1;
        int sod=0;
        int z=n;
        while(n!=0){
            sod+=n%10;
            pod*=n%10;
            n/=10;
        }
        return (z%(sod+pod)==0);
    }
}