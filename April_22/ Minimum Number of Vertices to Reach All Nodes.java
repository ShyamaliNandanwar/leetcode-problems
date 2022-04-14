class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();

        int in[] = new int[n];
        int out[] = new int[n];

        for(int i=0;i < edges.size();i++){
            in[edges.get(i).get(1)]++;
            out[edges.get(i).get(0)]++;
        }

        for(int i=0;i<n;i++){
            if(in[i] == 0 && out[i] > 0)
                res.add(i);
        }

        return res;
    }
}