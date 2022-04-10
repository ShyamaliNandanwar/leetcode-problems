class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();

        for(String s : ops){
            if(s.equals("C")){
                st.pop();
            }else if (s.equals("D") ){
                int n = st.peek();
                st.push(n*2);
            }else if(s.equals("+")){
                int n1 = st.pop();
                int n2 = st.peek();
                st.push(n1);
                st.push(n1+n2);
            }else{
                st.push(Integer.parseInt(s));
            }
        }

        int res = 0;
        while(!st.empty())
            res = res+ st.pop();

        return res;
    }
}