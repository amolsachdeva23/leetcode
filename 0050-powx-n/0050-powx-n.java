class Solution {
    public double myPow(double x, int n) {
        long N=n;
        double result=helper(x,Math.abs(N));
        if(n>0) return result;
        else return 1/result;
    }
    public double helper(double x, long n)
    {
           if(n==0) return 1;
           if(n%2==0) return helper(x*x,n/2);
           else return x*(helper(x*x,(n-1)/2));
    }
}