class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
       int minimum=Integer.MAX_VALUE;
       int maximum=Integer.MIN_VALUE;
       Set<Integer> set=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        minimum=Math.min(nums[i],minimum);
        maximum=Math.max(nums[i],maximum);
        set.add(nums[i]);
       }
       for(int i=minimum;i<=maximum;i++){
        if(!set.contains(i)){
            list.add(i);
        }
       }
     return list;
    }
}