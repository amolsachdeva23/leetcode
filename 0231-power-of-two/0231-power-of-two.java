class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        for (int x = 0; x < 31; x++) {
            if ((1 << x) == n)
                return true;
        }
        return false;
    }
}
