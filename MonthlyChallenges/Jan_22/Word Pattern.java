class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        String sa[] = s.split(" ");
        int i=0;
        if(sa.length != pattern.length())
            return false;
        for(String a : sa){
            char c = pattern.charAt(i);
            if(!hm.containsKey(c)){
                if(!hm.containsValue(a))
                    hm.put(c, a);
                else
                    return false;
            }else{
                String t = hm.get(c);
                if(!t.equals(a))
                    return false;
            }
            i++;
        }
        return true;
    }
}