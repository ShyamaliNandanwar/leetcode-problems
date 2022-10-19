class HouseRobber {
    public int rob(int[] nums) {
        int m = nums.length;
        int[] dp = new int[m+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 1;i<m;i++){
            dp[i+1] = Math.max(dp[i], nums[i]+dp[i-1]);
        }
        return dp[dp.length-1];
    }
}