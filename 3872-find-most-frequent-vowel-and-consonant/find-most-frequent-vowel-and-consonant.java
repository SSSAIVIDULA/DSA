class Solution {
    public int maxFreqSum(String s) {
        int[] count=new int[26];
       int vowelmax=0;
        int conmax=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             int num=ch-'a';
             count[num]++;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               vowelmax=Math.max(vowelmax,count[num]);

            }
            else{
                conmax=Math.max(conmax,count[num]);
            }
        }
       
        return vowelmax+conmax;
    }
}