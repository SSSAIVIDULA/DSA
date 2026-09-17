class Solution {
    public int[] minOperations(String boxes) {
        int[] ans=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            char ch=boxes.charAt(i);
            int total=0;
           for(int j=0;j<boxes.length();j++){
            char c=boxes.charAt(j);
            if(c=='1' && i!=j){
                total=total+Math.abs(i-j);
            }
           }
           ans[i]=total;
        }
        return ans;
    }
}