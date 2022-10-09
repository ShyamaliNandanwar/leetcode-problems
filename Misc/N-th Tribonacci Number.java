import java.util.HashMap;

class NthTribNumber {
    HashMap<Integer, Integer> hm = new HashMap<>();
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        if(!hm.containsKey(n)){
            hm.put(n,tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3) );
        }
        return hm.get(n);
    }
}