class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>n){
                list.add(nums[i]);
                
            }
        }
        Set<Integer> set=new HashSet<>(list);
        List<Integer> l=new ArrayList<>(set);
        
        return l;
    }
}