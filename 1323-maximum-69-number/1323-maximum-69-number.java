class Solution {
    public int maximum69Number (int num) {
        int pv=0;
        int spv=-1;
        int temp=num;
        while(temp!=0){
            int r=temp%10;
            if(r==6)spv=pv;
            temp/=10;
            pv++;
        }
        return num + 3* (int)Math.pow(10,spv);
    }
}