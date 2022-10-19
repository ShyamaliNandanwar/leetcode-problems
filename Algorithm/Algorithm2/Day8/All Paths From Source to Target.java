import java.util.*;

class PathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList();
        Queue<List<Integer>> q = new LinkedList();
        q.add(new ArrayList<>(Arrays.asList(0)));//0

        int destinationVertex = graph.length - 1;//3

        while(!q.isEmpty()) {
            List<Integer> pathSoFar = q.poll();
            int currentVertex = pathSoFar.get(pathSoFar.size() - 1);
            //System.out.println(currentVertex);
            if(currentVertex == destinationVertex)
                result.add(new ArrayList(pathSoFar));
            for(int v : graph[currentVertex]) {
                List<Integer> newPath = new ArrayList(pathSoFar);
                newPath.add(v);
                q.add(newPath);
            }
        }
        return result;
    }
}