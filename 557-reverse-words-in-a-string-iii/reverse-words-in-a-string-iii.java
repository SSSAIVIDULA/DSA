class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder sen=new StringBuilder();
        for(int i=0;i<str.length;i++){
            StringBuilder word=new StringBuilder(str[i]);
            sen.append(word.reverse());
            if(i<str.length-1){
                sen.append(" ");
            }
        }
        return sen.toString();
    }
}