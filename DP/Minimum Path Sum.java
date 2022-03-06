class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;

        int r = grid.length, c = grid[0].length;
        int dp[][] = new int[r][c];

        for(int i = 0; i< r; i++){
            for(int j=0; j< c; j++){
                if(i-1 > -1 && j-1 > -1)
                    dp[i][j] = grid[i][j] + Math.min(dp[i-1][j] , dp[i][j-1]);
                else if (i-1 > -1)
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                else if(j-1 > -1)
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                else
                    dp[i][j] = grid[i][j];
            }
        }
        return dp[r-1][c-1];
    }
}