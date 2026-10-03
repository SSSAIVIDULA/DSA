class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#' && !stk1.isEmpty()){
                stk1.pop();
            }
            else if(ch!='#'){
                stk1.push(ch);
            }
        }
        StringBuilder str1=new StringBuilder();
        for(char c:stk1){
            str1.append(c);
        }
        Stack<Character> stk2=new Stack<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch=='#' && !stk2.isEmpty()){
                stk2.pop();
            }
            else if(ch!='#'){
                stk2.push(ch);
            }
        }
         StringBuilder str2=new StringBuilder();
        for(char c:stk2){
            str2.append(c);
        }
        if(str1.toString().equals(str2.toString())) return true;
        return false;
    }
}