class Solution {
    public int[] evenOddBit(int n) {
        int e=0,o=0;
        for(int i=0;i<31;i++){
             if((n&(1<<i))!=0){
                if(i%2==0) e++;
                else o++;
             }
        }
        int[] arr={e,o};
        return arr;
    }
}