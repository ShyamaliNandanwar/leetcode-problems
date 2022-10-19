import java.util.Stack;

class EvaluatePolishNot {
    public int evalRPN(String[] tokens) {
        int res=0,n=0;
        Stack<Integer> st = new Stack<>();
        if(tokens.length ==1)
            return Integer.parseInt(tokens[0]);
        for(String s: tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*")||s.equals("/")){
                res=st.pop();
                n=st.pop();

                switch(s){
                    case "+": res = res+n;
                        break;
                    case "-": res = n-res;
                        break;
                    case "*": res = res*n;
                        break;
                    case "/": res = n/res;
                        break;
                }
                st.push(res);
            }else{
                st.push(Integer.parseInt(s));
            }
            
        }
        return res;
    }
}