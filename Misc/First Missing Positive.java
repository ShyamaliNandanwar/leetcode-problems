import java.util.TreeSet;

class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i=0; i< nums.length; i++)
            ts.add(nums[i]);

        int m = ts.last();
        for(int i=1; i< m; i++){
            if(!ts.contains(i))
                return i;
        }
        return m > 0 ? m+1 : 1;
    }
}