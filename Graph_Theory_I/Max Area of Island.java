class MaxAreaOfIsland {
    int area=0, maxArea = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    area = 0;
                    dfs(grid, i, j);
                }
            }
        }

        return maxArea;
    }

    private void dfs(int n[][], int r, int c){
        if(r < 0 || r > n.length -1 || c < 0 || c > n[0].length-1 || n[r][c] != 1)
            return;

        area = area+1;
        maxArea = Math.max(area, maxArea);

        n[r][c] = -1;
        dfs(n, r+1, c);
        dfs(n, r-1, c);
        dfs(n, r, c+1);
        dfs(n, r, c-1);
    }
}