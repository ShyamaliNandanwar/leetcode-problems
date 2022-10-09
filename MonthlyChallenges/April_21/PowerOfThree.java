public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        double t = Math.log10(n)/Math.log10(3);
        //System.out.println(t);
        if(t%1==0)
            return true;
        return false;
        
    }
}