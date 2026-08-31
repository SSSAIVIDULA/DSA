class Solution {
    public int count(int[] nums,int k){
        int left=0;
        int right=0;
        int count=0;
        int sum=0;
        if(k<0) return 0;
        while(right<nums.length){
           if(nums[right]%2!=0){
            sum++;
           }
            while(sum>k){
                if(nums[left]%2!=0){
                    sum--;
                }
            
                left++;
        }
        count=count+(right-left)+1;
        right++;

        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=count(nums,k)-count(nums,k-1);
        return ans;
    }
}