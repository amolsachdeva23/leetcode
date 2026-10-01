class Solution {
    public int missingNumber(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length + 1; i++) {
            if (!set.contains(i))
                return i;
        }
        return 0;
    }

}