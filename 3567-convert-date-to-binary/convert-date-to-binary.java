class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder str=new StringBuilder();
        String[] arr=date.split("-");
        for(int i=0;i<arr.length;i++){
            int num=Integer.parseInt(arr[i]);
            String b=Integer.toBinaryString(num);
            str.append(b);
            if(i<arr.length-1) str.append("-");
        }
        return str.toString();
    }
}