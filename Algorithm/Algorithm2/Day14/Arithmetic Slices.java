class Solution {
    public int numberOfArithmeticSlices(int[] a) {
        int res=0;
        int diff=0, idx=0;
        for(int i=0 ;i< a.length-1;i++){
            diff=a[i+1]-a[i];
            idx=1;
            for(int j=i;j< a.length-1;j++){
                if(a[j+1]-a[j] == diff){
                    idx++;
                    if(idx>= 3)
                        res++;
                }
                else{
                    diff = a[j+1]-a[j] ;
                    idx=0;
                }
            }
        }
        return res;
    }
}