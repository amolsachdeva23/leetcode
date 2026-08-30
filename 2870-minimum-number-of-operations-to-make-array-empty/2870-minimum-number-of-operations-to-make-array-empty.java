class Solution {
    public int minOperations(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int k=0;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           // int number = entry.getKey();
            int freq = entry.getValue();
            if (freq == 1) {
                return -1;
            }
            k += (freq + 2) / 3;
        }
        return k;
    }
}