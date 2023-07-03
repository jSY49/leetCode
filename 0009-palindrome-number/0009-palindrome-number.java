class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;
        
        char[] str = String.valueOf(x).toCharArray();
        int len = str.length /2;
        int idx= str.length-1;
        for(int i =0 ; i<len;i++){
            if(str[i]!=str[idx--]){
                return false;
            }
        }
        return true;
    }
}