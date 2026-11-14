class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minimum=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<nums.size();i++){
            int sum=0;

            for(int j=i;j<nums.size();j++){
                sum=sum+nums.get(j);
                count=j - i + 1;
                if(count>=l && count<=r && sum>0 ){
                    minimum=Math.min(minimum,sum);
                }
                if(count>=r) break;
                
            }
        }
        
        return minimum==Integer.MAX_VALUE ? -1 : minimum;
    }
}