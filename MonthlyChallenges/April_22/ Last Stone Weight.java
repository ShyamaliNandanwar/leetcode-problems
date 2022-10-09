import java.util.Collections;
import java.util.PriorityQueue;

class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i: stones)
            pq.offer(i);

        while(!pq.isEmpty()){
            if(pq.size() == 1)
                return pq.poll();

            int n = pq.poll();
            int m = pq.poll();

            if(n != m)
                pq.offer(Math.abs(n-m));
        }
        return 0;
    }
}