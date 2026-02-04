class Solution {
    public String minRemoveToMakeValid(String s) {
        int left=0;
        int right=0;
        StringBuilder sb=new StringBuilder();
        Stack<Integer> st=new Stack();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(sb.length());
                sb.append(ch);
            }
            else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                    sb.append(ch);
                }
            }else{
                sb.append(ch);
            }
        }
        while(!st.isEmpty()) {
            sb.deleteCharAt(st.pop());
        }
        return sb.toString();
    }
}