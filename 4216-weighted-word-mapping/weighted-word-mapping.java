class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        int m=weights.length;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                int num=ch-97;
                sum=sum+weights[num];
            }
            int a=sum%26;
            char c=(char)('z'-a);
            ans.append(c);
        }
        return ans.toString();
    }
}