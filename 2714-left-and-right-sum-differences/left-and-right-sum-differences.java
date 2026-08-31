class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
        }
        int copy=total;
        for(int i=0;i<nums.length;i++){
            total=total-nums[i];
            right[i]=total;
        }
        for(int i=nums.length-1;i>=0;i--){
           copy=copy-nums[i];
           left[i]=copy;
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(right[i]-left[i]);
        }
        return ans;
    }
}