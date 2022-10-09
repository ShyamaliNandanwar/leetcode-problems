class NoOfIslands {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count=0;

        for(int i=0; i< m;i++){
            for(int j=0;j < n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs( char n[][] , int r, int c){
        if(r < 0 || r > n.length-1 || c < 0 || c > n[0].length-1 || n[r][c] != '1')
            return;

        n[r][c] = '#';

        dfs(n, r+1, c);
        dfs(n, r-1, c);
        dfs(n, r, c+1);
        dfs(n, r, c-1);
    }
}