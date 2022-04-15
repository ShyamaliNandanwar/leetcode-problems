class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n: nums){
            if(pq.size() < k)
                pq.offer(n);
            else{
                if(n > pq.peek())
                {
                    pq.poll();
                    pq.offer(n);
                }
            }
        }

        if(!pq.isEmpty())
            return pq.poll();
        return -1;
    }
}