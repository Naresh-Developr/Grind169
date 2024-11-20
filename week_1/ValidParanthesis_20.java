import java.util.*;

class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            switch(c){
                case '{':
                case '[':
                case '(':
                    st.push(c);
                    break;

                case '}':
                    if(st.isEmpty() || st.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(st.isEmpty() || st.pop() != '['){
                        return false;
                    }
                    break;
                case ')':
                    if(st.isEmpty() || st.pop() != '('){
                        return false;
                    }
                    break;
              
            }
        
        }

        return st.isEmpty();
        
        
    }
}