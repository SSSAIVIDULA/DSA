class Solution {
    public String interpret(String command) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<command.length()-1;i++){
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str.append('o');
                i++;
            }
            else{
                if(command.charAt(i)!='(' && command.charAt(i)!=')'){
                str.append(command.charAt(i));
            }
            }
        }
        if(command.charAt(command.length()-1)=='G'){
            str.append('G');
        }
        return str.toString();
    }
}