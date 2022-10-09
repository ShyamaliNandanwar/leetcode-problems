
import java.util.*;

class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);//[-4,-1,-1,0,1,2]

        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;

            if(i>0 && nums[i] == nums[i-1])
                continue;

            while(j<k){
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                int sum = nums[i]+nums[j]+nums[k];

                if(sum==0){
                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                }
                else if(sum < 0)
                    j++;
                else
                    k--;

            }
        }
        return res;
    }


    public static void main(String[] args){
        int n[] = {-1,0,1,2,-1,-4};
        System.out.println("ans = " + threeSum(n));
    }
}