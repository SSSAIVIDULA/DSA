class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start=0;
        int end=0;
        int count=0;
        int sum=1;
        while(end<nums.length){
             sum=sum*nums[end];
            while(sum>=k && start<=end){
                sum=sum/nums[start];
                start++;
            }
            count=count+end-start+1;
            end++;
        }
        return count;
    }
}