import java.util.LinkedList;
import java.util.Queue;

class NoOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        Queue<Integer> q = new LinkedList<>();

        int countProvinces=0;
        int l = isConnected.length;
        boolean visited[] = new boolean[l];

        for(int i=0; i<l;i++){
            if(visited[i]) continue;

            visited[i] = true;
            q.offer(i);
            while(!q.isEmpty()){
                int c = q.poll();
                for(int j=0; j < isConnected[i].length; j++){
                    if(c!=j && isConnected[c][j] == 1 && !visited[j]){
                        q.offer(j);
                        visited[j] = true;
                    }
                }
            }
            countProvinces++;
        }
        return countProvinces;
    }
}