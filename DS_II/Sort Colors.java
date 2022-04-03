class Solution {
    public void sortColors(int[] nums) {
        int c[] = new int[3];
        for(int i:nums)
            c[i]++;
        int j=0;
        for(int i = 0; i< nums.length; i++){

            while(j<2 && c[j] == 0)
                j++;
            nums[i]= j;
            c[j]--;
        }
    }
}