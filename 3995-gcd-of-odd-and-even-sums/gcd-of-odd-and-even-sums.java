class Solution {
    public int gcd(int a,int b){
        int n1=a;
        int n2=b;
        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        return n1;
    }
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                even+=i;
            }
            else{
                odd+=i;
            }
        }
        int result=gcd(even,odd);
        return result;
    }
}