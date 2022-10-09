class LCS {
    public int longestCommonSubsequence(String s, String a) {
        int dp[][]=new int[s.length()+1][a.length()+1];

        for(int i=1; i<s.length()+1; i++){
            for(int j=1; j<dp[0].length; j++){
                if(s.charAt(i-1)==a.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[s.length()][a.length()];
    }
}