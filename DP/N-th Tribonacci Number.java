class Solution {
    public int tribonacci(int n) {
        if(n == 0 )
            return n;
        if(n == 1 || n ==2 )
            return 1;

        int res[] = new int[n+1];
        res[1] = res[2] = 1;

        for(int i=3; i<= n; i++)
            res[i] = res[i-3] + res[i-2] + res[i-1] ;

        return res[n];
    }
}