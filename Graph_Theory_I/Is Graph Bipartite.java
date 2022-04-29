class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();

        for(int j=0; j < graph.length; j++){
            if(color[j] == -1){
                q.offer(j);
                color[j] = 1;
                while(!q.isEmpty()){
                    int curr = q.poll();
                    int n[] = graph[curr];

                    for(int i : n){
                        if(color[i] == color[curr])
                            return false;

                        if(color[i] == -1){
                            color[i] = 1 - color[curr];
                            q.offer(i);
                        }
                    }
                }
            }
        }
        return true;
    }
}