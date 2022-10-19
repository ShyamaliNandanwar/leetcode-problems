import java.util.Comparator;
import java.util.PriorityQueue;

class Pair{
    int x, y;
    int dist;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
        this.dist = (x*x) + (y*y);
    }
}
class KClosestPoints {

    public int[][] kClosest(int[][] points, int k) {
        int res[][] = new int[k][2];

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return a.dist - b.dist;
            }});

        for(int i=0; i< points.length; i++){
            pq.offer(new Pair(points[i][0], points[i][1]));
        }

        int i=0;
        while(!pq.isEmpty()  && i < k){
            Pair p = pq.poll();
            res[i][0] = p.x;
            res[i][1] = p.y;
            i++;
        }

        return res;
    }
}