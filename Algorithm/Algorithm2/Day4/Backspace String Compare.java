import java.util.Stack;

class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && c=='#')
                st.pop();
            else if(c != '#')
                st.push(c);
        }
        String res1="";
        while(!st.isEmpty())
            res1 = res1 + st.pop();

        for(char c : t.toCharArray()){
            if(!st.isEmpty() && c=='#')
                st.pop();
            else if(c != '#')
                st.push(c);
        }

        String res2="";
        while(!st.isEmpty())
            res2 = res2 + st.pop();

        return res1.equals(res2);
    }
}