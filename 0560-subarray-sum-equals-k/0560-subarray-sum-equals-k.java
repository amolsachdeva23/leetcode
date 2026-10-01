class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        mpp.put(0, 1);

        int presum = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            presum += arr[i];

            int remove = presum - k;

            cnt += mpp.getOrDefault(remove, 0);

            mpp.put(presum, mpp.getOrDefault(presum, 0) + 1);
        }

        return cnt;
		
    }
}