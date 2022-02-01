class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null)
            return null;
        List<List<Integer>>  result = new ArrayList<>();
        genSubsets(0, nums, new ArrayList<Integer>(), result);

        return result;
    }
    public void genSubsets(int i, int[] nums, List<Integer> curr, List<List<Integer>>  result){
        result.add(new ArrayList<>(curr));
        for(int j=i; j<nums.length; j++){
            curr.add(nums[j]);
            genSubsets(j+1, nums, curr, result);
            curr.remove(curr.size()-1);
        }
    }
}