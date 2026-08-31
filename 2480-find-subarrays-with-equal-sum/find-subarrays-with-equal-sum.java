class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int start=0;
        int end=1;
        int sum=nums[0]+nums[1];
        set.add(sum);
        start++;
        end++;
        while(end<=nums.length-1){
            sum=nums[start]+nums[end];
            if(set.contains(sum)) return true;
            set.add(sum);
            sum=0;
            start++;
            end++;

        }
        return false;
    }
}