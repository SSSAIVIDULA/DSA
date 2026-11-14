class Solution {
    public int calculate(int[] w,int capacity){
        
        int days=1;
        int load=0;
        for(int i=0;i<w.length;i++){
            if(load+w[i]>capacity){
                days++;
                
                load=w[i];
            }
            else{
                load+=w[i];
            }
        }
        return days;
        

    }
    public int shipWithinDays(int[] weights, int days) {
        int total=0;
        int n=weights.length;
        int maximum=0;
        for(int i=0;i<n;i++){
            total=total+weights[i];
            maximum=Math.max(weights[i],maximum);
            
        }
        int low=maximum;
        int high=total;
        while(low<high){
            int mid=low+(high-low)/2;
            int res=calculate(weights,mid);
            if(res<=days){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
       

    }
}