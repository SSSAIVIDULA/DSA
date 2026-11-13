class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            int valid=1;
            for(int j=0;j<arr2.length;j++){
                int minus=Math.abs(arr1[i]-arr2[j]);
                if(minus<=d) {
                    valid=0;
                    break;
                }
            }
            if(valid==1) count++;
        }
        
        return count;
    }
}