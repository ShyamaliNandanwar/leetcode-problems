class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans =0;
        for(int i : nums)
            //XOR(^) our answer variable with each value and store the answer in our answer variable
            ans ^= i;
        return ans;
    }
}