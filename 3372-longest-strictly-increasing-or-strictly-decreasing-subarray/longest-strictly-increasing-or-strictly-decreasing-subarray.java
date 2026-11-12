class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maximum=0;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
            }
            else{
                maximum=Math.max(count,maximum);
                count=1;
            }
        }
        maximum=Math.max(count,maximum);
        int inc=maximum;
        maximum=0;
         count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
            else{
                maximum=Math.max(count,maximum);
                count=1;
            }
        }
        maximum=Math.max(count,maximum);
        int ans=Math.max(maximum,inc);
        return ans;
    }
}