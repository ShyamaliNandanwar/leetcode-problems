class ReverseWordsString3 {
    public String reverseWords(String s) {
        String st[] = s.split(" ");
        String res = "";
        for(String t : st){
            char c[] = t.toCharArray();
            int l =0 , r = c.length-1;
            while(l < r){
                char a = c[l];
                c[l] =c[r];
                c[r] = a;
                l++;
                r--;
            }
            res=res+String.copyValueOf(c) + " ";
        }
        res = res.substring(0, res.length() -1); // to remove extra space at the end
        return res;
    }
}