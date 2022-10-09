class Flood_Fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0) {
            return image;
        }
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    private void dfs(int[][]image, int row, int col, int target, int newColor) {
        if(row >= image.length || row < 0 || col >= image[0].length || col < 0 || image[row][col] == newColor || image[row][col] != target) {
            return;
        }
        if(image[row][col] == target) {
            image[row][col] = newColor;
        }
        dfs(image, row + 1, col, target, newColor);
        dfs(image, row - 1, col, target, newColor);
        dfs(image, row, col + 1, target, newColor);
        dfs(image, row, col - 1, target, newColor);
    }
}