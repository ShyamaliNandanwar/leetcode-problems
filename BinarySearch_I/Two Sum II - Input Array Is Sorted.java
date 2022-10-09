class TwoSum2 {
    public int[] twoSum(int[] n, int target) {
        int res[] = new int[2];

        int l=0, r=n.length-1;

        while(l < r){
            if(n[l] + n[r] == target){
                res[0] = l+1;
                res[1] = r+1;
                break;
            }else if(n[l] + n[r] < target)
                l++;
            else
                r--;
        }
        return res;
    }
}