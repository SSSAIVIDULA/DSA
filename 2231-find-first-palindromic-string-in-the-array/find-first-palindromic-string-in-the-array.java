class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder st=new StringBuilder(words[i]);
            StringBuilder s=new StringBuilder(words[i]);
            StringBuilder str=new StringBuilder(st.reverse());
            if(s.toString().equals(str.toString())){
                return s.toString();
            }
        }
        return "";
    }
}