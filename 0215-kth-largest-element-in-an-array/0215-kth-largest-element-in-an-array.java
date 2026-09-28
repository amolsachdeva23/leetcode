class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){ // nlogk
            pq.add(ele); // logk
            if(pq.size()>k) pq.remove(); // logk
        }
        return pq.peek();
    }
}