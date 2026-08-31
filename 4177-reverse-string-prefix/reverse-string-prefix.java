class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder str=new StringBuilder(s.substring(0,k)).reverse();
        if(k<s.length()){
            str.append(s.substring(k,s.length()));
        }
        return str.toString();
    }
}