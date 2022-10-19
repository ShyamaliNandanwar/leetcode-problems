import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class KeysAndBall {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();

        int visited[] = new int[rooms.size()];

        q.offer(0);

        while(!q.isEmpty()){
            int n = q.poll();

            if(visited[n] == 1) continue;

            visited[n] = 1;
            for(int i=0; i<rooms.get(n).size(); i++){
                q.offer(rooms.get(n).get(i));
            }
        }

        for(int i=0; i< visited.length; i++){
            if(visited[i] == 0)
                return false;
        }

        return true;
    }
}