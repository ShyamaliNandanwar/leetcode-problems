class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int  l = 0, r = numbers.length-1;
        while(r>l){
            int sum = numbers[l] +numbers[r];
            if(sum == target){
                int[] ans = {l+1, r+1};
                return ans;
            }
            if(sum < target){
                l++;
            } else {
                r--;
            }
        }
        return null;
    }
}