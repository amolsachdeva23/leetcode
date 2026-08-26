class Solution {
    public int maximum69Number(int num) {
        int x = num;
        int k = 0;
        while (x != 0) {
            k++;
            x /= 10;
        }
        x = num;
        int[] arr = new int[k];
        
        int i = k - 1;
        while (x != 0) {
            arr[i] = x % 10;
            x /= 10;
            i--;
        }
        x = num;
        for (i = 0; i < k; i++) {
            if (arr[i] == 6)
                break;
        }
        if (i == k)
            return num;
        else {
            arr[i] = 9;
            num = 0;
        }
        for (int a : arr) {
            num = num * 10 + a;
        }
        return num;
    }
}