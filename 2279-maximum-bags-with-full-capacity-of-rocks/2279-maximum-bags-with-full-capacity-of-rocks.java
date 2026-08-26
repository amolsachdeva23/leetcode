class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] diff = new int[capacity.length];

        for (int i = 0; i < capacity.length; i++) {
            diff[i] = capacity[i] - rocks[i];
        }
        int count=0;
        Arrays.sort(diff);
        for (int i = 0; i < diff.length; i++) {
            if (additionalRocks >= diff[i]) {
                additionalRocks -= diff[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}