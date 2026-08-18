class Solution {
    int[] dp;

    public int fib(int n) {
        dp=new int[n+1];
        return helper(n);
    }

    public int helper(int n) {
        if(dp[n]!=0) return dp[n];
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return dp[n]=helper(n - 1) + helper(n - 2);
    }
}