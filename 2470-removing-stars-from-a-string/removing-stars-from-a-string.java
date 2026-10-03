class Solution {
    public String removeStars(String s) {
        StringBuilder str=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                stack.push(ch);
            }
            if(ch=='*'){
                stack.pop();
            }
        }
        for(Character st:stack){
            str.append(st);
        }
        return str.toString();
    }
}