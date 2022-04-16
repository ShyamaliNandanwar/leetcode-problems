class Solution {
    boolean isSubLand=false;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int r=grid2.length;
        int c=grid2[0].length;
        int sub=0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c;j++){
                isSubLand = true;
                if(grid2[i][j] == 1){
                    dfs(grid1, grid2, i, j);
                    if(isSubLand)
                        sub++;
                }
            }
        }
        return sub;
    }

    private void dfs(int n1[][], int n2[][], int r, int c){
        if(r<0 || r > n2.length-1 || c < 0 || c > n2[0].length-1 || n2[r][c] != 1)
            return;

        if(n1[r][c] != n2[r][c])
            isSubLand = false;

        n2[r][c] = -1;

        dfs(n1, n2, r+1, c);
        dfs(n1, n2, r-1, c);
        dfs(n1, n2, r, c+1);
        dfs(n1, n2, r, c-1);
    }
}