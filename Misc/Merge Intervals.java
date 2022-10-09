import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0)
            return intervals;

        List<int[]> li = new ArrayList<>();
        Arrays.sort(intervals, (a, b)-> a[0] -b[0]);

        int n[] = intervals[0];
        int i =1;

        while(i < intervals.length){
            if(n[1] >= intervals[i][0])
                n[1] = Math.max(intervals[i][1], n[1]);
            else{
                li.add(n);
                n = intervals[i];
            }
            i++;
        }
        li.add(n);

        return li.toArray(new int[li.size()][]);
    }
}