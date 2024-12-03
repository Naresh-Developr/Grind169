class Solution {
    public int operate(int e1,int e2, char ch){
        int res=0;
        switch(ch){
            case '+':
                res = e1+e2;
                break;
            case '-':
                res = e1-e2;
                break;
            case '*':
                res = e1*e2;
                break;
            case '/':
                res = e1/e2;
                break;       
        }
        return res;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String str = tokens.toString(); 
        int n = str.length();
        for(int i=0;i<n;i++){
        	char x = str.charAt(i);
          	if(Character.isDigit(x)){ 
            	st.push(x-'0');
            }
          	else{
            	int ele2 = st.pop();
              	int ele1 = st.pop();
              	st.push(operate(ele1,ele2,x));
            }
          	
        }

        return st.pop();
        
    }
}