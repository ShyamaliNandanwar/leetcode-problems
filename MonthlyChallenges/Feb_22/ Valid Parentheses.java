import java.util.Stack;

class ValidParenthesis {
    public boolean isValid(String st) {
        Stack<Character> s = new Stack<>();
        for(char c: st.toCharArray()){
            if( c == '(' || c == '[' || c=='{')
                s.push(c);
            else {
                if(!s.empty()){
                    if((c == ')' &&  s.peek() == '(')
                            || (c == ']' &&  s.peek() == '[')
                            || (c == '}' &&  s.peek() == '{'))
                        s.pop();
                    else
                        return false;

                }else
                    return false;
            }
        }
        return s.empty();
    }
}