class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length()<2) return s;
        
        for(int i=s.length();i>0;i--){
            for(int j=0;j<=s.length()-i;j++){
                if(check(s.substring(j,i+j))){
                    return s.substring(j,i+j);
                }
            }
        }
        
        return "";
        
    }
    
    private boolean check(String str){
        int left = 0;
        int right = str.length()-1;
        
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    
    
}