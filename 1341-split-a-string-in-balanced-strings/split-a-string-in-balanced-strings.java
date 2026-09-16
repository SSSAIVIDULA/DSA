class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int r=0;
        int l=0;
        for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         if(ch=='L') l++;
         if(ch=='R') r++;
         if(l==r){
            count++;
            l=0;
            r=0;
         }
        }
        return count;
    }
}