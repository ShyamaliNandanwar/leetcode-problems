import java.util.Stack;

class BackSpaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        String s1 = calculate(s);
        String t1 = calculate(t);

        return s1.equals(t1);
    }

    private String calculate(String s){
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(!st.empty() && c == '#')
                st.pop();
            else if(c != '#')
                st.push(c);
        }

        s = new String();
        while(!st.empty())
            s = s+ st.pop();

        return s;
    }
}