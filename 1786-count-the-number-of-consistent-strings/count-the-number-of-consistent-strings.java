class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            char ch=allowed.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int count=0;
        for(int i=0;i<words.length;i++){
            int found=0;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                if(!map.containsKey(ch)) found=1;
            }
         if(found==0) {
            count++;
        }
        }
        return count;
    }
}