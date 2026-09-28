class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int n=indices[i];
            arr[n]=ch;
        }
        String ans=new String(arr);
        return ans;
    }
}