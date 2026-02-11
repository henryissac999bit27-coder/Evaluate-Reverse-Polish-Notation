class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stc=new Stack<>();
        for(String s:tokens)
        {
            if("+-*/".contains(s)){
                int b=stc.pop();
                int a=stc.pop();
                if(s.equals("+")) stc.push(a+b);
                else if(s.equals("-")) stc.push(a-b);
                else if(s.equals("*")) stc.push(a*b);
                else if(s.equals("/")) stc.push(a/b);
            }
            else{
                stc.push(Integer.parseInt(s));
            }
        }
        return stc.pop();
    }
}