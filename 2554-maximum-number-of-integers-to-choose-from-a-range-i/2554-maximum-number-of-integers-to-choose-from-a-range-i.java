class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int l=banned.length;
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<l;i++){
            set.add(banned[i]);
        }
        int sum=0;
        int k=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)) {
    if(sum + i > maxSum)
        break;

    sum += i;
    k++;
}
        }
        return k;
    }
}