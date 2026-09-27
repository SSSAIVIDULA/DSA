class Solution {
    public int minElement(int[] nums) {
        int minimum=Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
        int sum=0;
        int t=nums[i];
        while(t!=0){
            int temp=t%10;
            sum=sum+temp;
            t=t/10;
        }
        minimum=Math.min(sum,minimum);

      }  
      return minimum;
    }
}