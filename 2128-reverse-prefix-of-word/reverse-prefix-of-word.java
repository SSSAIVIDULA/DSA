class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str=new StringBuilder();
        str=str.append(word.substring(0,word.indexOf(ch)+1)).reverse();
        if(word.indexOf(ch)+1<word.length()){
            str.append(word.substring(word.indexOf(ch)+1,word.length()));
        }
        return str.toString();
    }
}