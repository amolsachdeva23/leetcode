class Solution {
    public int brokenCalc(int startValue, int target) {
        int k=0;
        while(target!=startValue){
            if(target%2==0&& target>startValue) target/=2;
            else target++;
           k++;
        }
        return k;
    }
}