class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0) {
            return image;
        }
        int currColor = image[sr][sc];
        dfs(image, sr,sc,newColor, currColor);
        return image;
    }

    private void dfs(int n[][], int r, int c, int nc, int cc){
        if(r < 0 || r > n.length-1 || c < 0 || c > n[0].length-1 || n[r][c] !=cc || n[r][c] == nc)
            return;

        n[r][c] = nc;
        dfs(n, r+1, c, nc, cc);
        dfs(n, r-1, c, nc, cc);
        dfs(n, r, c+1, nc, cc);
        dfs(n, r, c-1, nc, cc);
    }
}