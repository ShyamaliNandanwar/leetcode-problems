class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i =a.length()-1, j=b.length()-1;
        char carry ='0';
        while(i >= 0 && j >= 0 ){

            if(a.charAt(i) == '0' && b.charAt(j) == '0'){
                if(carry == '0')
                    res.append("0");
                else
                    res.append("1");
                carry ='0';
            }
            if((a.charAt(i) == '0' && b.charAt(j) == '1') || (a.charAt(i) == '1' && b.charAt(j) == '0')){
                if(carry == '0')
                    res.append("1");
                else{
                    res.append("0");
                    carry = '1';
                }
            }
            if(a.charAt(i) == '1' && b.charAt(j) == '1'){
                if(carry == '0')
                    res.append("0");
                else
                    res.append("1");
                carry = '1';
            }
            i--;
            j--;
        }
        while(i >= 0){
            if(carry == '0')
                res.append(a.charAt(i));
            else
            {
                if(a.charAt(i) == '0'){
                    res.append("1");
                    carry ='0';
                }
                else{
                    res.append("0");
                    carry ='1';
                }
            }
            i--;
        }
        while( j>=0){
            if(carry == '0')
                res.append(b.charAt(j));
            else{
                if(b.charAt(j) == '0'){
                    res.append("1");
                    carry ='0';
                }
                else{
                    res.append("0");
                    carry ='1';
                }
            }
            j--;
        }

        if(carry == '1')
            res.append("1");
        return res.reverse().toString();
    }
}