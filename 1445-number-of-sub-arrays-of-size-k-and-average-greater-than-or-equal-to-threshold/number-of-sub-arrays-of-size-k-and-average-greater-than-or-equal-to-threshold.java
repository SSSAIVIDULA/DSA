class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start=0;
        int end=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int count=0;
        while(end<arr.length){
         if((sum/k) >= threshold) count++;
          if(end==arr.length-1) break;
         sum=sum-arr[start];
       
         end++;
         start++;
          sum=sum+arr[end];
        }
        return count;
    }
}