class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxfreq=0;
        int freq=0;
        int ans=-1;
        for(int num:nums){
            if(num%2==0){
                freq=map.get(num);
                if(freq>maxfreq || (freq==maxfreq && num<ans)){
                    maxfreq=freq;
                    ans=num;
                }
            }
        }
        return ans;

    }
}