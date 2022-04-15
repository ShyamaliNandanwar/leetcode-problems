class Solution {
    public int minOperations(int n) {
        int count=0;

       for(int j=0;j<(n/2);j++)
                count = count+ (n -((2*j)+1));
        
        return count;  
    }
}