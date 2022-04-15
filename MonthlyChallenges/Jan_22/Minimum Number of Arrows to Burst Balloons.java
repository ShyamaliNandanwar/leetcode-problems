class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points == null || points.length==0)
            return 0;
        if(points.length==1)
            return 1;
        Arrays.sort(points, (p1,p2)->Integer.compare(p1[1],p2[1]));

        int end = points[0][1], count=1;
        for(int[] point : points){
            if(point[0] > end){
                count++;
                end=point[1];
            }
        }
        return count;
    }
}