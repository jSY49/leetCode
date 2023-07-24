class Solution {
    public int myAtoi(String s) {
        s = s.trim(); //공백제거
        
        int sign=1,start =0;
        long res=0;
        
        if(s.isBlank()) return 0;
        
        if(s.charAt(0)=='-') {
            sign=-1;
            start = 1;
        }else if(s.charAt(0)=='+'){
            start = 1;
        }   
        
        for(int i = start; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                res = res*10 + s.charAt(i)-'0';
            }else{
                break;
            }
            
            if(res>=Integer.MAX_VALUE)
                    break;
        }
        
        res = res*sign;
        
        if(res>=Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(res<=Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int)res;
    }
}