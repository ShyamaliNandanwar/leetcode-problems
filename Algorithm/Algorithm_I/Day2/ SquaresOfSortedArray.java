class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int left=0,right=nums.length-1;
        int ind=nums.length-1;
        for(int i=0;i<nums.length;i++)
            nums[i]=nums[i]*nums[i];
        while(left<=right){
            if(nums[left] < nums[right]){
                res[ind--]=nums[right];
                right--;
            }else if(nums[left] > nums[right]){
                res[ind--]=nums[left];
                left++;
            }else{
                if(left==right)
                    res[ind--]=nums[left++];
                else{
                    //System.out.println("else");
                    res[ind--]=nums[left++];
                    res[ind--]=nums[right--];
                }
            }

        }
        return res;
    }
}