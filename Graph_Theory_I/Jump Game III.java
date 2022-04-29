class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean visited[] = new boolean[arr.length];

        Queue< int [] > q = new LinkedList<>();

        q.offer(new int[]{arr[start], start});

        while(!q.isEmpty()){
            int n[] = q.poll();
            if(visited[n[1]]) continue;
            visited[n[1]] = true;

            if(n[0] == 0)
                return true;
            if(n[1]+n[0] < arr.length)
                q.offer(new int[]{arr[n[1]+n[0]],n[1]+n[0]} );
            if(n[1]-n[0] >= 0)
                q.offer(new int[]{arr[n[1]-n[0]],n[1]-n[0]} );

        }
        return false;
    }
}