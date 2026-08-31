class Solution {
    public int subarray(int[] nums,int k){
        int start=0;
        int end=0;
        int count=0;
        int sum=0;
        while(end<nums.length){
            if(nums[end]%2!=0){
                sum++;
            }
            while(sum>k){
                if(nums[start]%2!=0){
                    sum--;
                }
                start++;
            }
            count=count+end-start+1;
            end++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=subarray(nums,k)-subarray(nums,k-1);
        return ans;
    }
}