
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class FirstBadVersion1 //extends VersionControl
{
    public int firstBadVersion(int n) {
        int l =1, r=n;
        while(l <= r){
            int m = l + (r-l)/2;
            if(!isBadVersion(m))
                l = m+1;
            else
                r = m-1;
        }
        return l;
    }

    private boolean isBadVersion(int m) {
        return true;
    }
}