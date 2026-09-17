class Solution {
    public int[] minOperations(String boxes) {
        int[] ans=new int[boxes.length()];
        int operations=0;
        int ball=0;
        for(int i=0;i<boxes.length();i++){
            char ch=boxes.charAt(i);
            operations=operations+ball;
            if(ch=='1'){
                ball++;
            }
            ans[i]=operations;
        }
        operations=0;
        ball=0;
        for(int i=boxes.length()-1;i>=0;i--){
            char ch=boxes.charAt(i);
            operations=operations+ball;
            if(ch=='1'){
                ball++;
            }
            ans[i]=ans[i]+operations;
            
        }
        return ans;
    }
}