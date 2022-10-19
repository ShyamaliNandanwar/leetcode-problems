class NoOfIslands1 {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }


    private void dfs(char arr[][], int i, int j) {
        if (i >= arr.length || i < 0 || j >= arr[0].length || j < 0 || arr[i][j] != '1') {
            return;
        }

        arr[i][j] = '#';
        dfs(arr, i-1, j);
        dfs(arr, i+1, j);
        dfs(arr, i, j-1);
        dfs(arr, i, j+1);
    }
}