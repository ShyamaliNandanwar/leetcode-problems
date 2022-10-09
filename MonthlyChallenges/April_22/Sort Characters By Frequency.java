import java.util.HashMap;
import java.util.PriorityQueue;

class SortCharsByFreq {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c: s.toCharArray())
            hm.put(c, hm.getOrDefault(c, 0) + 1);

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));

        for(char c : hm.keySet())
            pq.offer(c);

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            char c = pq.poll();
            int n = hm.get(c);
            for(int i=0; i< n;i++)
                sb.append(c);

        }
        return sb.toString();
    }
}