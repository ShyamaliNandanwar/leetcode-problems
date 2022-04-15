class Solution {
    public int myAtoi(String str) {
       str = str.trim();
        if(str.length()==0)
            return 0;
        char c = str.charAt(0);
        long r=0;
        boolean flag=true;
        //System.out.println("c=" + c);
        if((c >='0' && c<='9') || ((c =='-' || c =='+') && str.length()!=1)){
            if(c =='-')
                flag=false;
            else if(c >='0' && c<='9')
                r = r*10  + (c- '0');
            for(int i=1; i<str.length(); i++){
                c= str.charAt(i);
               // System.out.println("c1=" + c);
                if(c >='0' && c<='9'){
                    r = r*10  + (c- '0');
                }
                else{
                    break;
                }
                if(r > Integer.MAX_VALUE) // overflow
                    return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        else
            return 0;
        if(r > Integer.MAX_VALUE) // overflow
                    return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        return flag ? (int)r : -1 * (int)r;
    }
}