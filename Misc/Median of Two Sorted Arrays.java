class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if(l1 ==0 && l2 ==0)
            return -1;
        if(l1==0)
            return getMedian(nums2, l2);
        if(l2==0)
            return getMedian(nums1, l1);
        int r[] = new int[l1+l2];
        int i=l1+l2-1;
        l1--;
        l2--;
        while(l1 > -1 && l2 > -1)
        {
            if(nums1[l1] > nums2[l2])
                r[i--] = nums1[l1--];
            else
                r[i--] = nums2[l2--];
        }

        while(l1 > -1)
            r[i--] = nums1[l1--];

        while(l2 > -1)
            r[i--] = nums2[l2--];

        return getMedian(r, nums1.length+nums2.length);
    }

    private double getMedian(int a[], int l){
        int m = l/2;
        if(m > 0 ){
            if(l%2 == 0 )
                return (double)(a[m]+a[m-1])/2;
        }
        return a[m];
    }
}